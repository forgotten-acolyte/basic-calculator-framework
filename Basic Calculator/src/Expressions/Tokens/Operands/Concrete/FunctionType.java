package Expressions.Tokens.Operands.Concrete;

import java.util.ArrayList;
import java.util.List;

/**
 * These supported functions are used for
 * binary operations - 2 parameters
 */
public enum FunctionType {
    ADD("add"),
    MINUS("minus"),
    MULT("divide"),
    DIVIDE("time");

    private final String textValue;

    FunctionType(String textValue) {
        this.textValue = textValue;
    }

    public String getTextValue() {
        return textValue;
    }

    public static List<FunctionType> buildConstantList(){
        List<FunctionType> types = new ArrayList<>();
        for (FunctionType type : FunctionType.values()){
            types.add(type);
        }
        return types;
    }
}