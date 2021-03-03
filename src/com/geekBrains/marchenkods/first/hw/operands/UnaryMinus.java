package com.geekBrains.marchenkods.first.hw.operands;

class UnaryMinus extends Operand {

    UnaryMinus() {
        setName("Унарный минус");
        setOperand("--");
        setPriority(Priority.FOUR);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return 0D;
    }

    Double calculate(Double value) {
        return --value;
    }

}
