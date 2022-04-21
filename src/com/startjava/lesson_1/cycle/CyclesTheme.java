package com.startjava.lesson_1.cycle;

public class CyclesTheme {
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел от [-10,21] Cycle do-while;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;
        int value = -10;
        System.out.println("1. Подсчет суммы четных и нечетных чисел от -10 до 21 ");
        do {
            if (value % 2 == 0) {
                sumOfEvenNumbers += value;
            } else {
                sumOfOddNumbers += value;
            }
            value++;
        } while (value != 21);
        System.out.println("Сумма четных чисел = " + sumOfEvenNumbers + " Сумма нечетных чисел = " + sumOfOddNumbers + " Значение Value = " + value);
        System.out.println();

        //Вывод чисел между max и min 10,5,-1
        System.out.println("2. Вывод чисел между max и min 10,5,-1");
        int a = 10, b = 5, c = -1;
        int max = 0;
        int min = 0;
        if (max < a) {
            max = a;
        } else if (max < b) {
            max = b;
        } else if (max < c) {
            max = c;
        }
        if (min > a) {
            min = a;
        } else if (min > b) {
            min = b;
        } else if (min > c) {
            min = c;
        }
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        //Вывод реверсивного числа и суммы его цифр 1234
        System.out.println();
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int reverseNumber = 0;
        int sumNumber = 0;
        System.out.println("Исходное число = " + number);
        while (number != 0) {
            reverseNumber = 10 * reverseNumber + number % 10;
            System.out.println(number % 10);
            sumNumber += number % 10;
            number /= 10;
        }
        System.out.println("Реверсивное число = " + reverseNumber + " сумма чисел = " + sumNumber);
        //Вывод чисел на консоль в несколько строк
        System.out.println();
        System.out.println("4. Вывод чисел на консоль в несколько строк");
        int valueCount = 0;
        int lineCount = 1;
        for (int i = 1; i <= 24; i += 2) {
            System.out.format("%2d ", i);
            valueCount++;
            if (valueCount % 5 == 0) {
                System.out.println();
                lineCount++;
            }
        }
        if ((valueCount + lineCount) % 5 == 0) {
            for (int j = 0; j < lineCount; j++) {
                System.out.format("%2d ", 0);
            }
        }
        System.out.println();
        System.out.println();
        //Проверка количества единиц на четность
        System.out.println("5. Проверка количества единиц на четность");
        int numberUnit = 31415191;
        int unitCounter = 0;
        System.out.println("Дано число: " + numberUnit);
        while (numberUnit > 0) {
            if (numberUnit % 10 == 1) {
                unitCounter++;
            }
            numberUnit /= 10;
        }
        if (unitCounter % 2 == 0) {
            System.out.println("Количество единиц в числе = " + unitCounter + " , четное");
        } else {
            System.out.println("Количество единиц в числе = " + unitCounter + " , нечетное");
        }
        //Отображение фигур в консоли
        System.out.println("6. Отображение фигур в консоли");
        System.out.println("Прямоугольник");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Прямоугольный треугольник");
        int size = 5, temp = 0;

        while (size != 0) {
            while (temp != size) {
                System.out.print("#");
                temp++;
            }
            size--;
            temp = 0;
            System.out.println();
        }
        //Вывод таблицы ASCII
        System.out.println();
        System.out.println("Вывод таблицы ASCII");
        System.out.println("DEC CHAR");

        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
}