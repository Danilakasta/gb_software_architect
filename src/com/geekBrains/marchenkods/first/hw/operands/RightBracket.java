package com.geekBrains.marchenkods.first.hw.operands;

class RightBracket extends Operand {

    RightBracket() {
        setName("Правая скобка");
        setOperand(")");
        setPriority(Priority.MINUS_FIRST);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return 0D;
    }


}
