package INTEPRETOR_pattern.Lexing;

import Expressions.Tokens.Token;

import java.util.*;


/**
 * No brackets of all kind are inserted
 * Proceed with operators' predefined precedence's levels/points
 */
class Solution {
    private Stack<String> shunting = new Stack<String>();
    private List<String> queue = new ArrayList();
    private Map<String, Integer> precedence = new HashMap<>();

    private boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public Solution() { // + - * / ( )
        precedence.put("+", 1);
        precedence.put("-", 1);
        //
        precedence.put("*", 2);
        precedence.put("/", 2);
        //
        precedence.put("(", 3);
        precedence.put(")", 0); //ending indicator
    }
    public void tokenize(String s) {
        List<String> converted = tokenSeparator(s);
        String token = null;
        for (int i = 0, n = converted.size(); i < n; i++) {
            token = converted.get(i);
            if (isNumeric(token)) {//operand
                queue.add(token);
            } else if (token.equals(")")) {
                fetchOperators();
            } else{
                if (shunting.isEmpty()){
                    shunting.push(token);
                    continue;
                }
                boolean higher = currentStackHigherPrecedence(token, shunting.peek());
                if (higher){
                    shunting.push(token);
                    continue;
                }
                while (!higher && !shunting.isEmpty()){
                    queue.add(shunting.pop());
                    //update
                    if (shunting.isEmpty())
                        break;
                    higher = currentStackHigherPrecedence(token, shunting.peek());
                }
                shunting.push(token);
            }
        }
        fetchOperators();
    }

    private boolean currentStackHigherPrecedence(String firstOperator,String secondOperator){
        return precedence.get(firstOperator) > precedence.get(secondOperator);
        //else :=> less than or equal to
    }

    private void fetchOperators(){
        while (!shunting.isEmpty()) {
            String popped = shunting.pop();
            if (!popped.equals("(")) {
                queue.add(popped);
            }
        }
    }

    private List<String> tokenSeparator(String s) {
        List<String> tokens = new ArrayList<>();
        StringBuilder eachToken = new StringBuilder();
        char[] input = s.toCharArray();
        for (int i = 0, n = input.length; i < n; i++) {
            if (input[i] == ' ')
                continue;
            if (!Character.isDigit(input[i])) {
                eachToken.append(input[i]);
            } else {
                while (i < n && Character.isDigit(input[i])) {
                    eachToken.append(input[i++]);
                }
                i--;
            }
            tokens.add(eachToken.toString());
            eachToken = new StringBuilder();
        }
        return tokens;
    }

    private boolean isOperator(String x) {
        boolean res = false;
        switch (x) {
            case "+":
            case "-":
            case "*":
            case "/":
                res = true;
                break;
        }
        return res;
    }

    private int performCalc(int a, int b, String operator) {
        int res = -1;
        switch (operator) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
        }
        return res;
    }

    public int evalRPN(String[] tokens) {
        int a, b, caled = -1;
        String token;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0, n = tokens.length; i < n; i++){
            token = tokens[i];
            if(!isOperator(token)){
                stack.push(Integer.valueOf(token));
            }else{
                if (!stack.isEmpty()){
                    b = stack.pop();
                    a = stack.pop();
                    caled = performCalc(a,b, token);
                    //push back the value to the stack
                    stack.push(caled);
                }
            }
        }
        if (caled == -1)
            return stack.pop(); //only 1 value in the stack
        return caled;
    }

    public int calculate(String s) {
        tokenize(s);
        System.out.println(queue);
        String[] strings = queue.stream().toArray(String[]::new);
        return evalRPN(strings);
    }
}

public class LexProcessor {

    private boolean isValid(String input){
        return true;
    }

    public static List<Token> transform(String input){
        List<Token> tokens = null;
        return tokens;
    }

    public static void main(String[] args) {
        /**
         * --use case:
         *     // number cases:
         *     input =  "(1+(4+5+2)-3)+(6+8)"
         *     input =  "(-2 + 3) * 10 + 3 / 2"
         *     input =  "((-4) + 3) * 10 + 3 / 2"
         *     input =  "(-4) * 10 + 3 / 2"
         *     input =  "(5 - (-2)  ) * 10 /4"
         *
         *     //function cases:
         *
         *     input =  "add(5,-10) + minus(10, 10) * 10 + (-2 - (-3)  ) "
         *     
         *     
         *     
         *     3 + 2 * 3 - 2 * 10 / 2
         *
         * queue :  3 2 3 *popped +popped 2 10 *popped 2 /popped 
         *
         * 3 2 3 * + 2 10 * 2 / -
         *
         * + * : meets -
         * 			-> pop * , +
         *
         * - * : meets / 
         * 			-> pop * 
         *
         * - / : eofl	
         * 		-> pop / , -
         */

        String input = "=add(5,-10) + =minus(10, 10) * 10 + (-2 - (-3)  ) ";
        String input_2 = "(-2 + 3) * 10 + 3 / 2";

        String input_3 = "3 + 2 * 3 - 2 * 10 / 2";

        //output : 3 2 3 * + 2 10 * 2 / -

        Solution solution = new Solution();
        int res = solution.calculate(input_3);
        System.out.println(res);

    }
}
