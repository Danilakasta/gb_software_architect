package com.geekBrains.marchenkods.components.operands;

import com.geekBrains.marchenkods.constants.OperandConst;
import com.geekBrains.marchenkods.constants.OperandNameConst;
import com.geekBrains.marchenkods.constants.Priority;

/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class Multiply extends Operand {

    Multiply() {
        setName(OperandNameConst.MULTIPLY);
        setOperand(OperandConst.MULTIPLY);
        setPriority(Priority.THIRD);
    }

    /**
     * On Demand Holder idiom
     */
    public static class Holder {
        public static final Multiply HOLDER_INSTANCE = new Multiply();
    }

    public static Multiply getInstance() {
        return Multiply.Holder.HOLDER_INSTANCE;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return firstValue / secondValue;
    }

}
