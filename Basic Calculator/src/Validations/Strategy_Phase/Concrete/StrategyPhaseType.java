package com.company.leetcode.BasicCalculator.Validations.Strategy_Phase.Concrete;

import com.company.leetcode.BasicCalculator.Validations.Strategy_Phase.Abstraction.StrategyPhase;

public enum StrategyPhaseType {
    FUNCTION_PHASE,
    NUMBER_PHASE;

    public static StrategyPhase createFunctionStrategyPhase(String input){
        return new FunctionStrategyPhase(input, FUNCTION_PHASE);
    }

    public static StrategyPhase createNumberStrategyPhase(String input){
        return new NumberStrategyPhase(input, NUMBER_PHASE);
    }
}
