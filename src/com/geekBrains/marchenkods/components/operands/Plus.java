package com.geekBrains.marchenkods.components.operands;

import com.geekBrains.marchenkods.constants.Priority;
import com.geekBrains.marchenkods.constants.OperandConst;
import com.geekBrains.marchenkods.constants.OperandNameConst;

/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class Plus extends Operand {

    Plus() {
        setName(OperandNameConst.PLUS);
        setOperand(OperandConst.PLUS);
        setPriority(Priority.SECOND);
    }

    /**
     * On Demand Holder idiom
     */
    public static class Holder {
        public static final Plus HOLDER_INSTANCE = new Plus();
    }

    public static Plus getInstance() {
        return Plus.Holder.HOLDER_INSTANCE;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue + secondValue;
    }

}
