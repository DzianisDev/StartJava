public class VariablesTheme {
    public static void main(String[] args){
       byte processorCores = 4;
       short frequency = 1800;
       int RAM = 8192;
       long GPU = 2048;
       float cost = 1400_56;
       double discount = 10.99;
       char symbols = '$';
       System.out.println("1. Создание переменных и вывод их на консоль");
       System.out.println("Number of processor cores = " + processorCores 
       + " CPU frequency = " + frequency + " RAM = " + RAM + " GPU = " + GPU
       + " Cost = " + cost + " discount = " + discount + " Currency = " + symbols);
       
       System.out.println("2. Расчет стоимости товара со скидкой");
       int firstPrice = 100;
       int secondPrice = 200;
       discount = 0.11;

       System.out.println("Сумма скидки = " + (firstPrice + secondPrice)*discount);
       System.out.println("Общая стоимость товара со скидкой = " + ((firstPrice + secondPrice) - (firstPrice + secondPrice)*discount));

       

    }    
}
