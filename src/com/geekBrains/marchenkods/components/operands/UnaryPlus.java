package com.geekBrains.marchenkods.components.operands;

import com.geekBrains.marchenkods.constants.OperandConst;
import com.geekBrains.marchenkods.constants.OperandNameConst;
import com.geekBrains.marchenkods.constants.Priority;


/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class UnaryPlus extends Operand {

    UnaryPlus() {
        setName(OperandNameConst.UNARY_MINUS);
        setOperand(OperandConst.UNARY_MINUS);
        setPriority(Priority.FOUR);
    }

    /**
     * On Demand Holder idiom
     */
    public static class Holder {
        public static final UnaryPlus HOLDER_INSTANCE = new UnaryPlus();
    }

    public static UnaryPlus getInstance() {
        return UnaryPlus.Holder.HOLDER_INSTANCE;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return 0D;
    }

    Double calculate(Double value) {
        return ++value;
    }
}
