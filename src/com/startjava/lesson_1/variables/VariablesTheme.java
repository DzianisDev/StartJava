package com.startjava.lesson_1.variables;

public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их на консоль

        byte processorCores = 4;
        short frequency = 1800;
        int RAM = 8192;
        long GPU = 2048;
        float cost = 1400.56f;
        double discount = 10.99;
        char symbols = '$';

        System.out.println("1. Создание переменных и вывод их на консоль");
        System.out.println("Number of processor cores: " + processorCores + "\n"
                + "CPU frequency: " + frequency + "\n"
                + "RAM: " + RAM + " GPU: " + GPU + "\n"
                + "Cost: " + cost + " discount: " + discount + "\n"
                + "Currency: " + symbols);

        //Расчет стоимости товара со скидкой
        System.out.println();
        System.out.println("2. Расчет стоимости товара со скидкой");
        int firstPrice = 100;
        int secondPrice = 200;
        discount = 0.11;
        System.out.println("Сумма скидки = " + (firstPrice + secondPrice) * discount);
        System.out.println("Общая стоимость товара со скидкой = " + ((firstPrice + secondPrice) - (firstPrice + secondPrice) * discount));

        //Вывод на консоль слово Java
        System.out.println();
        System.out.println("3. Вывод на консоль слово JAVA");
        System.out.println("   J    a  v     v  a    ");
        System.out.println("   J   a a  v   v  a a   ");
        System.out.println("J  J  aaaaa  V V  aaaaa  ");
        System.out.println(" JJ  a     a  V  a     a ");
        System.out.println();

        //Отображение min и max значений числовых типов данных
        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;
        System.out.println("byte max value = " + byteMax + " byte min value = " + byteMin + "\n"
                + "short max value = " + shortMax + " short min value = " + shortMin + "\n"
                + "int max value = " + intMax + " int min value = " + intMin);
        System.out.format("byteMax increment = %d  byteMax decrement = %d%n", ++byteMax, --byteMax);
        System.out.format("byteMin increment = %d  byteMin decrement = %d%n", ++byteMin, --byteMin);
        System.out.format("shortMax increment = %d shortMax decrement = %d%n", ++shortMax, --shortMax);
        System.out.format("shortMin increment = %d  shortMin decrement = %d%n", ++shortMin, --shortMin);
        System.out.format("intMax increment = %d  intMax decrement = %d%n", ++intMax, --intMax);
        System.out.format("intMin increment = %d  intMin decrement = %d%n", ++intMin, --intMin);
        System.out.println();

        //Перестановка значений переменных
        System.out.println("5. Перестановка значений переменных");
        int firstVariable = 5;
        int secondVariable = 10;
        int thirdVariable = 0;
        System.out.println("First variable = " + firstVariable + " Second variable = " + secondVariable
                + " Third variable = " + thirdVariable);
        thirdVariable = firstVariable;
        firstVariable = secondVariable;
        secondVariable = thirdVariable;
        System.out.println("First variable = " + firstVariable + " Second variable = " + secondVariable
                + " Third variable = " + thirdVariable);
        System.out.println();
        //Вывод символов и их кодов
        System.out.println("6. Вывод символов и их кодов");
        byte a = 35;
        byte b = 38;
        byte c = 64;
        byte d = 94;
        byte e = 95;
        System.out.format("%d  %s%n", a, (char) a);
        System.out.format("%d  %s%n", b, (char) b);
        System.out.format("%d  %s%n", c, (char) c);
        System.out.format("%d  %s%n", d, (char) d);
        System.out.format("%d  %s%n", e, (char) e);
        System.out.println();

        //Произведение и сумма цифр числа
        System.out.println("7. Произведение и сумма цифр числа");
        int number = 345;
        int productOfNumbers = 1;
        int sumOfNumbers = 0;
        productOfNumbers *= number % 10;
        sumOfNumbers += number % 10;
        number /= 10;
        productOfNumbers *= number % 10;
        sumOfNumbers += number % 10;
        number /= 10;
        productOfNumbers *= number % 10;
        sumOfNumbers += number % 10;
        number /= 10;
        System.out.println("Произведение чисел = " + productOfNumbers + " Сумма чисел = " + sumOfNumbers);
    }
}
