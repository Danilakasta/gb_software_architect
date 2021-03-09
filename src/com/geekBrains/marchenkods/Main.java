package com.geekBrains.marchenkods;

import java.util.Scanner;
import com.geekBrains.marchenkods.service.RPNCalculator;

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

        RPNCalculator rpnCalculator = new RPNCalculator(iputStr);
        rpnCalculator.read();
        rpnCalculator.printRPNExpression();
        rpnCalculator.calculate();
        rpnCalculator.print();
    }


}
