package Validations.Abstraction;

import Validations.Concrete.StrategyType;

public abstract class BaseStrategy implements Strategy{

    protected final StrategyType type;

    protected BaseStrategy(StrategyType type) {
        this.type = type;
    }
}
