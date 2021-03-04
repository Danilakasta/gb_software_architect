package com.geekBrains.marchenkods.components.operands;

import com.geekBrains.marchenkods.constants.Priority;
import com.geekBrains.marchenkods.constants.OperandConst;
import com.geekBrains.marchenkods.constants.OperandNameConst;
import com.geekBrains.marchenkods.constants.Priority;

/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class Minus extends Operand {

    Minus() {
        setName(OperandNameConst.MINUS);
        setOperand(OperandConst.MINUS);
        setPriority(Priority.SECOND);
    }

    /**
     * On Demand Holder idiom
     */
    public static class Holder {
        public static final Minus HOLDER_INSTANCE = new Minus();
    }

    public static Minus getInstance() {
        return Minus.Holder.HOLDER_INSTANCE;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue - secondValue;
    }

}
