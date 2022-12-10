package com.company.leetcode.BasicCalculator.Expressions.Tokens.Operators.Abstraction;

import com.company.leetcode.BasicCalculator.Expressions.Tokens.Operands.Concrete.OperandAssociativity;

public interface Operator {
    void associate(OperandAssociativity type);
    OperandAssociativity getType();
    int getPrecedence();
}
