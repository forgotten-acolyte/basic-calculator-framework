package Expressions.Tokens.Operands.Concrete;


import Expressions.Tokens.Operands.Abstraction.BaseOperand;
import Value.Abstraction.Value;

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
