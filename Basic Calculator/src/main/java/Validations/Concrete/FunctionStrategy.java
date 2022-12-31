package Validations.Concrete;


import Expressions.Tokens.Operands.Concrete.FunctionType;
import Validations.Abstraction.BaseStrategy;

import java.util.List;

public class FunctionStrategy extends BaseStrategy {

    private final String FUNCTION_INDICATOR = "=";
    private final List<FunctionType> functionTypes = FunctionType.buildConstantList();
    private final boolean validatedResult = false;

    private boolean functionStrategy(String input){
        //pass function indicator check
        String casted = functionTypes.toString();
        for (int i = 0, n = input.length(); i < n; i++){
            if (String.valueOf(input.charAt(i)).equalsIgnoreCase(FUNCTION_INDICATOR)){

            }

            if(!casted.equalsIgnoreCase(String.valueOf(input.charAt(i)))){
                return false;
            }
        }
        return true;
    }


    public static boolean functionStrategyValidate(String input){
        return true;
    }

    public static boolean validate(String input){
        return true;
    }

    public FunctionStrategy(StrategyType type) {
        super(type);
    }

    @Override
    public void applyStrategy() {
        boolean result;
    }

    @Override
    public boolean getResult() {
        return validatedResult;
    }

}
