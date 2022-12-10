package com.company.leetcode.BasicCalculator.Expressions.Tokens.Operators.Concrete;

public enum OperatorType {
    ADD("ADDITION", "+"),
    MINUS("SUBSTRACTION", "sign"),
    MULTIPLY("MULTIPLICATION", "*"),
    DIVIDE("DIVISION", "*"),
    LEFT_PARENTHESIS("LEFT_PARENTHESIS", "("),
    RIGHT_PARENTHESIS("RIGHT_PARENTHESIS", ")");

    private final String code;
    private final String sign;

    OperatorType(String code, String sign) {
        this.code = code;
        this.sign = sign;
    }
}
