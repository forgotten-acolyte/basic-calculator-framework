package main.java.Expressions.Tokens.Operands.Concrete;

import Value.Abstraction.Value;
import main.java.Expressions.Tokens.Operands.Abstraction.BaseOperand;

import java.util.List;

/**
 * Can be either 2 or -3
 * - is an operator
 */
public class NumberOperand extends BaseOperand {

    private final List<String> components;

    public NumberOperand(String code, String name, List<String> components) {
        super(code, name);
        this.components = components;
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
