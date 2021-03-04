package com.geekBrains.marchenkods.components.operands;

import com.geekBrains.marchenkods.constants.OperandConst;
import com.geekBrains.marchenkods.constants.OperandNameConst;
import com.geekBrains.marchenkods.constants.Priority;

/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class LeftBracket extends Operand {

    LeftBracket() {
        setName(OperandNameConst.LEFT_BRACKET);
        setOperand(OperandConst.LEFT_BRACKET);
        setPriority(Priority.FIRST);
    }

    /**
     * On Demand Holder idiom
     */
    public static class Holder {
        public static final LeftBracket HOLDER_INSTANCE = new LeftBracket();
    }

    public static LeftBracket getInstance() {
        return LeftBracket.Holder.HOLDER_INSTANCE;
    }

    @Override
    public Double calculate(Double firstValue, Double secondValue) {
        return 0D;
    }

}
