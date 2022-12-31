package main.java.Validations.Strategy_Phase.Concrete;


import main.java.Validations.Strategy_Phase.Abstraction.BaseStrategyPhase;

public class FunctionStrategyPhase extends BaseStrategyPhase {

    private final String input;
    private final StrategyPhaseType type;

    public FunctionStrategyPhase(String input, StrategyPhaseType type) {
        this.input = input;
        this.type = type;
    }
}
