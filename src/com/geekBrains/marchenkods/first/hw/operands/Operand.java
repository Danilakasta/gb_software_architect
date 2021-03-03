package com.geekBrains.marchenkods.first.hw.operands;

public abstract class Operand implements ICalculate{
    private String name;
    private String operand;
    private Priority priority;

    public String getName() {
        return name;
    }

    public String getOperand() {
        return operand;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
