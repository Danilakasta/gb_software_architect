package com.geekBrains.marchenkods.first.hw.operands;

class Minus extends Operand {

    Minus() {
        setName("Минус");
        setOperand("-");
        setPriority(Priority.SECOND);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue - secondValue;
    }

}
