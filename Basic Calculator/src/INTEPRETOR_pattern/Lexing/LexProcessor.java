package INTEPRETOR_pattern.Lexing;

import Expressions.Tokens.Token;

import java.util.List;

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
         */

        String input = "=add(5,-10) + =minus(10, 10) * 10 + (-2 - (-3)  ) ";
        String input_2 = "(-2 + 3) * 10 + 3 / 2";
    }
}
