package com.startjava.lesson_1.ifelsestatement;
public class ifElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 24;
        boolean isMale = true;
        double height = 1.85;
        String name = "Dzianis";

        if (age > 20) {
            System.out.println("You're over 20 years old!");
        } else {
            System.out.println("You're less than 20 years old :(");
        }

        if (!isMale) {
            System.out.println("Ohh... shit, you're a women");
        }

        if (height < 1.80) {
            System.out.println("Your height is under 180 cm");
        } else {
            System.out.println("Your height is over 180 cm");
        }

        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("First letter of your name = M");
        } else if (firstLetterOfName == 'I') {
            System.out.println("First letter of your name = I");
        } else {
            System.out.println("First Letter of your name = " + firstLetterOfName);
        }

        //Поиск максимального и минимального числа
        System.out.println("2. Поиск максимального и минимального числа");
        int a = 10;
        int b = 23;
        if ( a > b) {
            System.out.println(" Max = " + a + " Min = " + b );
        } else {
            System.out.println("Max = " + b + " Min = " + a);
        }

        //Работа с числом
        System.out.println("3. Работа с числом");
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(" Число = " + number + " является четным");
        } else {
            System.out.println(" Число = " + number + " является нечетным");
        }
        if (number != 0) {
            System.out.println(" Число = " + number + " не является нулевым" );
        } else {
            System.out.println(" Число является нулевым");
        }
        if (number < 0) {
            System.out.println("Число является отрицательным");
        } else {
            System.out.println(" Число положительное");
        }

        //Поиск одинаковых цифр в числах
        System.out.println("4. Поиск одинаковых цифр в числах");
        int firstNumber = 345;
        int secondNumber = 445;
        for (int i = 0; i < 3; i++) {
            if (firstNumber % 10 == secondNumber % 10) {
                System.out.println(firstNumber % 10);
            }
            firstNumber /= 10;
            secondNumber /=10;
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("5. Определение буквы, числа или символа по их коду");
        char symbol = '\u007B';
        System.out.println("Символ = "+symbol);
        for(int i = 0; i < 128; i++) {
            if((symbol == (char)i) && i>=48 && i<=57) {
                System.out.println("Символ является числом");
            } else if ((symbol == (char)i) && i>=65 && i<=90
            || ((symbol == (char)i) && i>=97 && i<=122)) {
                System.out.println("Символ является буквой");
            } else if (((symbol == (char)i) && i>=0 && i<=47) ||
            ((symbol == (char)i) && i>=58 && i<=64) || ((symbol == (char)i) && i >=91 && i<=96)
            || ((symbol == (char)i) && i>=123 && i<=127)) {
                System.out.println("Символ относится к специальным");
            }
        }

        //Определение суммы вклада и начисленных банком %
        System.out.println("6. Определение суммы вклада и начисленных %");
        double deposit = 30_001;
        double percent = 0;
        if (deposit < 100_000) {
            percent = 0.05; 
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            percent = 0.07;
        } else if (deposit > 300_000) {
            percent = 0.1;
        }
        double depositAccrual = 0f;
        depositAccrual = deposit * percent;
        double totalAmount = deposit + depositAccrual;
        System.out.println("Сумма вклада: " + deposit + "\n"
            + "Начисленно: " + depositAccrual + "\n"
            + "Итоговая сумма: " + totalAmount );
    }   
}
