package com.geekBrains.marchenkods.first.hw.operands;

class Multiply extends Operand {

    Multiply() {
        setName("Умножить");
        setOperand("*");
        setPriority(Priority.THIRD);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue / secondValue;
    }

}
