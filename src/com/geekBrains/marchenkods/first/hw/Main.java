package com.geekBrains.marchenkods.first.hw;

import java.util.Scanner;
/**
 * Задание
 * 	Для тренировки и закрепления материала необходимо на любом императивном языке,
 * 	поддерживающем структурную парадигму программирования (С, Python, JS, Go, Rust, Pascal),
 * 	написать консольную программу вычисления значения произвольного математического выражения,
 * 	содержащего следующие операции:+-+-*\()
 * 	Для решения данной задачи необходимо воспользоваться обратной польской записью, а главное
 * 	— программа должна быть выполнена в структурном стиле. Все алгоритмы и структуры данных
 * 	(стек, очередь и др.) должны быть реализованы самостоятельно. Кроме самого числового результата
 * 	необходимо выводить на экран выражение, составленное в обратной польской записи. Ниже
 * 	представлен пример работы программы.
 * 	(1 + 2) * 4 + 3
 * 	Вывод:
 * 1 2 + 4 × 3 +
 * 15
 * Уроки с примерами реализаций польской нотации
 * https://vk.com/video-159908458_456248890
 * https://www.youtube.com/watch?v=6AMp0zH7x7M
 *
 * java не было в списке, но это родной язык для меня, реализовал как можно проше чтобы было похоже на структурный стиль
 * сорян за клас Mystack если реализовать методы то прийдется их задвоитьтак как стек в 2 местах юзается
 */
public class Main {


    /**
     * Основной поток программы
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String iputStr = in.nextLine();
        String RPNString = expressionToRPN(iputStr);
        System.out.println(RPNString);
        System.out.println(RPNtoAnswer(RPNString));
    }


    /**
     * Преобразуем выражение к виду польской нoтации
     *
     * @param expr
     * @return
     */
   static String expressionToRPN(String expr) {
        String current = "";
        MyStack<Character> stack = new MyStack<>();

        int priority;
        for (int i = 0; i < expr.length(); i++) {
            priority = checkPriority(expr.charAt(i));

            if (priority == 0) current += expr.charAt(i);
            if (priority == 1) stack.push(expr.charAt(i));
            if (priority > 1) {
                current += ' ';
                while (!stack.empty()) {
                    if (checkPriority(stack.peek()) >= priority) {
                        current += stack.pop();
                    } else break;
                }
                stack.push(expr.charAt(i));
            }
            if (priority == -1) {
                current += ' ';
                while (checkPriority(stack.peek()) != 1) {
                    current += stack.pop();
                }
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            current += stack.pop();
        }


        return current;
    }

    /**
     * Вычисление выражения в польской нотации
     *
     * @param rpn
     * @return
     */
    static double RPNtoAnswer(String rpn) {
        String operand = new String();
        MyStack<Double> stack = new MyStack<>();

        for (int i = 0; i < rpn.length(); i++) {
            if (rpn.charAt(i) == ' ') continue;

            if (checkPriority(rpn.charAt(i)) == 0) {
                while (rpn.charAt(i) != ' ' && checkPriority(rpn.charAt(i)) == 0) {
                    operand += rpn.charAt(i++);
                    if (i == rpn.length()) break;
                }
                stack.push(parseDouble(operand));
                operand = new String();
            }
            if (checkPriority(rpn.charAt(i)) > 1) {
                double tmp1 = stack.pop();
                double tmp2 = stack.pop();
                stack.push(calculateOperand(rpn.charAt(i), tmp1,  tmp2));
            }

        }

        return stack.pop();
    }

    /**
     * Математическое вычисление выражения
     * @param string
     * @param tmp1
     * @param tmp2
     * @return
     */
    static double calculateOperand(Character string, double tmp1, double tmp2){
        switch (string) {
            case '+':
                return tmp1 + tmp2;
            case '-':
                return tmp2 - tmp1;
            case '*':
                return tmp2 * tmp1;
            case '/':
                return tmp2 / tmp1;
        }
        return 0;
    }

    /**
     * Проверка приотитета операнда
     *
     * @param token
     * @return
     */
    static int checkPriority(char token) {
        if (token == '*' || token == '/') return 3;
        else if (token == '+' || token == '-') return 2;
        else if (token == '(') return 1;
        else if (token == ')') return -1;
        else return 0;
    }

    /**
     * @param string
     * @return
     */
    static Double parseDouble(String string) {
        return Double.parseDouble(string);
    }


}
