package com.geekBrains.marchenkods.components.operands;

import com.geekBrains.marchenkods.constants.Priority;
import com.geekBrains.marchenkods.constants.OperandConst;
import com.geekBrains.marchenkods.constants.OperandNameConst;
import com.geekBrains.marchenkods.constants.Priority;

/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class UnaryMinus extends Operand {

    UnaryMinus() {
        setName(OperandNameConst.UNARY_MINUS);
        setOperand(OperandConst.UNARY_MINUS);
        setPriority(Priority.FOUR);
    }

    /**
     * On Demand Holder idiom
     */
    public static class Holder {
        public static final UnaryMinus HOLDER_INSTANCE = new UnaryMinus();
    }

    public static UnaryMinus getInstance() {
        return UnaryMinus.Holder.HOLDER_INSTANCE;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return 0D;
    }

    Double calculate(Double value) {
        return --value;
    }

}
