package com.geekBrains.marchenkods.first.hw.operands;

class UnaryPlus extends Operand {

    UnaryPlus() {
        setName("Унарный плюс");
        setOperand("++");
        setPriority(Priority.FOUR);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return 0D;
    }

    Double calculate(Double value) {
        return ++value;
    }
}
