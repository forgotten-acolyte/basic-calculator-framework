package Validations;

import Validations.Abstraction.Strategy;


/**
 * Validation algorithm
 * 1. well-formed input expression string
 * 2. apply contextual/runtime strategy
 */
public class ValidationStrategy {

    private final Strategy strategy;

    public ValidationStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public boolean getValidationStrategyResult(){
        strategy.applyStrategy();
        return strategy.getResult();
    }
}
