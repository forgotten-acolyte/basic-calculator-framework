package Expressions.Tokens.Operands.Concrete;

import Value.Abstraction.Value;
import main.java.Expressions.Tokens.Operands.Abstraction.BaseOperand;

public class FunctionOperand extends BaseOperand {

    private final FunctionType type;

    public FunctionOperand(String code, String name, FunctionType type) {
        super(code, name);
        this.type = type;
    }

    @Override
    public String getCode() {
        return getCode();
    }

    @Override
    public String getName() {
        return getName();
    }

    @Override
    public Value calculate() {
        return null;
    }
}
