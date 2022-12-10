package Expressions.Tokens.Operators.Concrete;

import Expressions.Tokens.Operators.Abstraction.BaseOperator;
import com.company.leetcode.BasicCalculator.Expressions.Tokens.Operands.Concrete.OperandAssociativity;

public class AddOperator extends BaseOperator {

    private final String code;
    private final String sign;
    private final OperandAssociativity associativity;

    public AddOperator(OperandAssociativity associativity, String code, String sign) {
        super(associativity);
        this.code = code;
        this.sign = sign;
        this.associativity = associativity;
    }

    @Override
    public void associate(OperandAssociativity type) {

    }

    @Override
    public OperandAssociativity getType() {
        return null;
    }

    @Override
    public int getPrecedence() {
        return 0;
    }
}
