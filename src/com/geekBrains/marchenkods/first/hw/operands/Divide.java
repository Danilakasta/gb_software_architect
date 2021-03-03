package com.geekBrains.marchenkods.first.hw.operands;

class Divide extends Operand {

    Divide() {
        setName("Поделить");
        setOperand("/");
        setPriority(Priority.THIRD);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue / secondValue;
    }

}
