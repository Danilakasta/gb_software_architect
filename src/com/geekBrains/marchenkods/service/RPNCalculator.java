package com.geekBrains.marchenkods.service;

import com.geekBrains.marchenkods.components.helpers.DoubleHelper;
import com.geekBrains.marchenkods.components.holders.OperandHolder;
import com.geekBrains.marchenkods.constants.Priority;

import java.util.Queue;
import java.util.Stack;


/**
 * @author danil on 04.03.2021.
 * @project PostfixCalc
 */
public class RPNCalculator implements ICalculator {

    private String expression;
    private String RPNExpression = new String();
    private Double result = new Double(0D);

    public RPNCalculator(String expression) {
        OperandHolder.getInstance();
        this.expression = expression;
    }


    /**
     * Преобразуем выражение к виду польской нoтации
     *
     * @return
     */
    @Override
    public void read() {
        Stack<Character> stack = new Stack<>();
        int priority;
        for (int i = 0; i < expression.length(); i++) {
            priority = OperandHolder.checkPriority(expression.charAt(i));
            if (priority == Priority.ZERO.getVal()) RPNExpression += expression.charAt(i);
            if (priority == Priority.FIRST.getVal()) stack.push(expression.charAt(i));
            if (priority > Priority.FIRST.getVal()) {
                RPNExpression += ' ';
                while (!stack.empty()) {
                    if (OperandHolder.checkPriority(stack.peek()) >= priority) {
                        RPNExpression += stack.pop();
                    } else break;
                }
                stack.push(expression.charAt(i));
            }
            if (priority == Priority.MINUS_FIRST.getVal()) {
                RPNExpression += ' ';
                while (OperandHolder.checkPriority(stack.peek()) != Priority.FIRST.getVal()) {
                    RPNExpression += stack.pop();
                }
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            RPNExpression += stack.pop();
        }
    }

    /**
     * Вычисление выражения в польской нотации
     *
     * @return
     */
    @Override
    public void calculate() {
        String operand = new String();
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < RPNExpression.length(); i++) {
            if (RPNExpression.charAt(i) == ' ') continue;

            if (OperandHolder.checkPriority(RPNExpression.charAt(i)) == Priority.ZERO.getVal()) {
                while (RPNExpression.charAt(i) != ' ' && OperandHolder.checkPriority(RPNExpression.charAt(i)) == Priority.ZERO.getVal()) {
                    operand += RPNExpression.charAt(i++);
                    if (i == RPNExpression.length()) break;
                }
                stack.push(DoubleHelper.parseDouble(operand));
                operand = new String();
            }
            if (OperandHolder.checkPriority(RPNExpression.charAt(i)) > Priority.FIRST.getVal()) {
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();
                stack.push(OperandHolder.findOperand(RPNExpression.charAt(i)).calculate(tmp2, tmp1));
            }

        }
        result = stack.pop();
    }

    @Override
    public void print() {
        System.out.println(result);
    }

    public void printRPNExpression() {
        System.out.println(RPNExpression);
    }

}
