package com.geekBrains.marchenkods.first.hw.operands;

class LeftBracket extends Operand {

    LeftBracket() {
        setName("Левая скобка");
        setOperand("(");
        setPriority(Priority.FIRST);
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return 0D;
    }

}
