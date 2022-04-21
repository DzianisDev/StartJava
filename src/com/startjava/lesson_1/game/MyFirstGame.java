package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 39;
        int playerNumber = 2;

        while (hiddenNumber != playerNumber) {
            if (playerNumber > hiddenNumber) {
                System.out.println("Число " + playerNumber + " больше чем загадал компьютер");
                playerNumber -= 11;
            } else if (playerNumber < hiddenNumber) {
                System.out.println("Число " + playerNumber + " меньше чем загадал компьютер");
                playerNumber += 41;
            }
        }
        System.out.println("Поздравляю, Вы угадали число! \n"
                + "Ваше число: " + playerNumber + "\n"
                + "Загаданное число: " + hiddenNumber);
    }
}
