public class Calculator {
    public static void main(String[] args) {
        /*
        * над целыми положительными числами программа 
        * должна уметь выполнять следующие вычисления: +, -, *, /, ^, %
        */
        int firstNumber = 20;
        int secondNumber = 6;
        int result = 0;
        char mathOperation = '^';

        if (mathOperation == '+') {
            result = firstNumber + secondNumber;
        } else if (mathOperation == '-') {
            result = firstNumber - secondNumber;
        } else if (mathOperation == '*') {
            result = firstNumber * secondNumber;
        } else if (mathOperation == '/') {
            result = firstNumber / secondNumber;
        } else if (mathOperation == '^') {
            result = 1;
            for (int i = 0; i < secondNumber; i++) {
                result *= firstNumber;
            }
        } else if (mathOperation == '%') {
            result = firstNumber % secondNumber;
        } else {
            System.out.println("Введен некорректный математический оператор");
        }
        System.out.println(firstNumber + " " + mathOperation + " " + secondNumber + " = " + result);
    }    
}
