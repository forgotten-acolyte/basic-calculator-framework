package Expressions.Tokens;


import Expressions.Concrete.TokenExpressionType;

public class Token {
    private final TokenExpressionType type;

    public Token(TokenExpressionType type) {
        this.type = type;
    }

    public TokenExpressionType getType() {
        return type;
    }
}
