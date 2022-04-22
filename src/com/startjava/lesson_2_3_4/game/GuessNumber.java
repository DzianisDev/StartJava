package com.startjava.lesson_2_3_4.game;

import java.util.Random;

public class GuessNumber {

    private int number;
    private Player playerOne;
    private Player playerTwo;

    GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    private int generateNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public void startGame() {
        number = generateNumber();
        System.out.println("Computer generate number, try to guess number");
    }

    public boolean checkMove(Player player) {
        if (player.getNumber() == this.number) {
            win(player);
            return true;
        } else {
            lose(player);
            return false;
        }
    }

    private void win(Player player) {
        System.out.println("Congratulations!" + player.getName() + " Your number: " + player.getNumber() + " is TRUE!");
    }

    private void lose(Player player) {
        System.out.println("Ohh, damn, " + player.getName() + " Your number: " + player.getNumber() + " you lose :(");
    }
}