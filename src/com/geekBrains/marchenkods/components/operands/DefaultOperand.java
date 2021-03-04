package com.geekBrains.marchenkods.components.operands;

import com.geekBrains.marchenkods.constants.OperandConst;
import com.geekBrains.marchenkods.constants.OperandNameConst;
import com.geekBrains.marchenkods.constants.Priority;

/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class DefaultOperand extends Operand {

    public DefaultOperand() {
        setPriority(Priority.ZERO);
    }

    /**
     * On Demand Holder idiom
     */
    public static class Holder {
        public static final DefaultOperand HOLDER_INSTANCE = new DefaultOperand();
    }

    public static DefaultOperand getInstance() {
        return DefaultOperand.Holder.HOLDER_INSTANCE;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue + secondValue;
    }

}
