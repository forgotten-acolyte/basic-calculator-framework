package main.java.Expressions.Tokens.Operands.Abstraction;

import Value.Abstraction.Value;

public interface Operand {
    String getCode();
    String getName();
    Value calculate();
}
