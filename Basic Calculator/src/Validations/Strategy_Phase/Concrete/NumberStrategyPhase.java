package com.company.leetcode.BasicCalculator.Validations.Strategy_Phase.Concrete;

import com.company.leetcode.BasicCalculator.Validations.Strategy_Phase.Abstraction.BaseStrategyPhase;

public class NumberStrategyPhase extends BaseStrategyPhase {

    private final String input;
    private final StrategyPhaseType type;

    public NumberStrategyPhase(String input, StrategyPhaseType type) {
        this.input = input;
        this.type = type;
    }
}
