package Expressions.Tokens.Operators.Abstraction;

import com.company.leetcode.BasicCalculator.Expressions.Tokens.Operands.Concrete.OperandAssociativity;

public abstract class BaseOperator implements com.company.leetcode.BasicCalculator.Expressions.Tokens.Operators.Abstraction.Operator {

    protected OperandAssociativity associativity;

    public BaseOperator(OperandAssociativity associativity) {
        this.associativity = associativity;
    }
}
