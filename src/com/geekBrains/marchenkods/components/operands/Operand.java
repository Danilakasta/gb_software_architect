package com.geekBrains.marchenkods.components.operands;

import com.geekBrains.marchenkods.constants.Priority;

/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public abstract class Operand implements IActions{
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
