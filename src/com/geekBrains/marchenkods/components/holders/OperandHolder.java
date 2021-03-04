package com.geekBrains.marchenkods.components.holders;

import com.geekBrains.marchenkods.components.operands.Multiply;
import com.geekBrains.marchenkods.components.operands.Operand;
import com.geekBrains.marchenkods.components.operands.*;

import javax.annotation.PostConstruct;
import javax.print.attribute.standard.OrientationRequested;
import java.util.ArrayList;
import java.util.List;

/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class OperandHolder {

    private static Operand defaultOperand = new DefaultOperand();

    public static final List<Operand> OPERANDS = new ArrayList<>();

    public OperandHolder() {
        OPERANDS.add(Plus.getInstance());
        OPERANDS.add(Minus.getInstance());
        OPERANDS.add(Multiply.getInstance());
        OPERANDS.add(Divide.getInstance());
        OPERANDS.add(UnaryMinus.getInstance());
        OPERANDS.add(UnaryPlus.getInstance());
        OPERANDS.add(RightBracket.getInstance());
        OPERANDS.add(LeftBracket.getInstance());
    }


    public static class Holder {
        public static final OperandHolder HOLDER_INSTANCE = new OperandHolder();
    }

    public static OperandHolder getInstance() {
        return OperandHolder.Holder.HOLDER_INSTANCE;
    }

    /**
     * @param operand
     * @return
     */
    public static Operand findOperand(char operand) {
        try {
            return OperandHolder.OPERANDS.stream()
                    .filter(operands -> operands.getOperand().equals(String.valueOf(operand)))
                    .findFirst()
                    .get();
        } catch (Exception e) {
            return defaultOperand;
        }
    }

    /**
     *
     * @param operandChar
     * @return
     */
    public static int checkPriority(char operandChar) {
        Operand operand = findOperand(operandChar);
        return operand != null ? operand.getPriority().getVal() : 0;
    }
}
