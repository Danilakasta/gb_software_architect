package com.geekBrains.marchenkods.components.operands;

import com.geekBrains.marchenkods.constants.OperandConst;
import com.geekBrains.marchenkods.constants.OperandNameConst;
import com.geekBrains.marchenkods.constants.Priority;

/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class RightBracket extends Operand {

    RightBracket() {
        setName(OperandNameConst.RIGHT_BRACKET);
        setOperand(OperandConst.RIGHT_BRACKET);
        setPriority(Priority.MINUS_FIRST);
    }

    /**
     * On Demand Holder idiom
     */
    public static class Holder {
        public static final RightBracket HOLDER_INSTANCE = new RightBracket();
    }

    public static RightBracket getInstance() {
        return RightBracket.Holder.HOLDER_INSTANCE;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return 0D;
    }


}
