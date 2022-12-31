package main.java.Expressions.Tokens.Operands.Abstraction;

public abstract class BaseOperand implements Operand {

    private final String code;
    private final String name;

    protected BaseOperand(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }
}
