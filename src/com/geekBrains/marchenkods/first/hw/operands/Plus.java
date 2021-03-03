package com.geekBrains.marchenkods.first.hw.operands;

class Plus extends Operand {

    Plus() {
        setName("Плюс");
        setOperand("+");
        setPriority(Priority.SECOND);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue + secondValue;
    }

}
