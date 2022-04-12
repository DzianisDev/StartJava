public class Main {
    public static void main(String[] args) {
        //TODO: просуммировать числа в диапазоне от 1 - 5      
           int sum = 0;
            for (int i = 1; i<=5; i++) {
                System.out.printf("Вычисления = %d + %d",sum, i);
                sum +=i;
                System.out.printf(" = %d \n",sum);
                isEvenNumber(sum);
            }
           System.out.println("Result= " + sum);
        
    }
    private static void isEvenNumber(int sum) { 
        if (sum % 2 == 0) {
            System.out.println("Число " + sum + " является четным");
        } else {
            System.out.println("Число " + sum + " является нечетным");
        }
    }
}
