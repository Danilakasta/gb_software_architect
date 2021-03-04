package com.geekBrains.marchenkods.components.operands;


import com.geekBrains.marchenkods.constants.Priority;
import com.geekBrains.marchenkods.constants.OperandConst;
import com.geekBrains.marchenkods.constants.OperandNameConst;

/**
 *
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class Divide extends Operand {

    private Divide() {
        setName(OperandNameConst.DIVIDE);
        setOperand(OperandConst.DIVIDE);
        setPriority(Priority.THIRD);
    }

    /**
     * On Demand Holder idiom
     */
    public static class Holder {
        public static final Divide HOLDER_INSTANCE = new Divide();
    }

    public static Divide getInstance() {
        return Holder.HOLDER_INSTANCE;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue / secondValue;
    }

}
