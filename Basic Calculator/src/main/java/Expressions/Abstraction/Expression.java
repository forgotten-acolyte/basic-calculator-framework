package Expressions.Abstraction;


import Expressions.Tokens.Token;

import java.util.List;

public interface Expression {
    boolean isValid();
    List<Token> getTokens();
}
