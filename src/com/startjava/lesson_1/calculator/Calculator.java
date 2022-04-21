package com.startjava.lesson_1.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private int result = 0;
    private char mathOperation;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int calculate() {
        switch (this.mathOperation) {
            case '+':
                return add();
            case '-':
                return substract();
            case '*':
                return multiply();
            case '/':
                return divide();
            case '^':
                return exponentiate();
            case '%':
                return divideByReminder();
            default:
                System.out.println("Invalid math operator!");
                return -1;
        }
    }

    private int add() {
        return this.firstNumber + this.secondNumber;
    }

    private int substract() {
        return this.firstNumber - this.secondNumber;
    }

    private int multiply() {
        return this.firstNumber * this.secondNumber;
    }

    private int divide() {
        return this.firstNumber / this.secondNumber;
    }

    private int exponentiate() {
        int result = 1;
        for (int i = 0; i < secondNumber; i++) {
            result *= firstNumber;
        }
        return result;
    }

    private int divideByReminder() {
        return this.firstNumber % this.secondNumber;
    }
}
