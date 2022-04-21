package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        String choice;

        do {
            System.out.println("Введите первое число: ");
            calc.setFirstNumber(scanner.nextInt());
            System.out.println("Введите второе число: ");
            calc.setSecondNumber(scanner.nextInt());
            System.out.println("Введите математическую операцию");
            calc.setMathOperation(scanner.next().charAt(0));
            System.out.println(calc.calculate());

            do {
                System.out.println("Желаете продолжить вычисления? [yes/no]");
                choice = scanner.next();
            } while (!choice.equals("no") && !choice.equals("yes"));
        } while (!choice.equals("no"));

    }
}