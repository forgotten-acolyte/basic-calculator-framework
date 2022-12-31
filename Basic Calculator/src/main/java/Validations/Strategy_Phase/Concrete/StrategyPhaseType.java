package main.java.Validations.Strategy_Phase.Concrete;

import main.java.Validations.Strategy_Phase.Abstraction.StrategyPhase;

public enum StrategyPhaseType {
    FUNCTION_PHASE,
    NUMBER_PHASE;

    public static StrategyPhase createFunctionStrategyPhase(String input){
        return (StrategyPhase) new FunctionStrategyPhase(input, FUNCTION_PHASE);
    }

    public static StrategyPhase createNumberStrategyPhase(String input){
        return (StrategyPhase) new NumberStrategyPhase(input, NUMBER_PHASE);
    }
}
