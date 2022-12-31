package Validations.Concrete;


import Validations.Abstraction.BaseStrategy;

public class NumberStrategy extends BaseStrategy {

    public NumberStrategy(StrategyType type) {
        super(type);
    }

    @Override
    public void applyStrategy() {

    }

    @Override
    public boolean getResult() {
        return false;
    }
}
