public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.name = "Wolfhound";
        wolfOne.age = 3;
        wolfOne.color = "Grey";
        wolfOne.sex = "Male";
        wolfOne.weight = 3.4f;
        
        System.out.println("Wolf name: " + wolfOne.name + "\n"
            + "Wolf age: " + wolfOne.age + "\n"
            + "Wolf color: " + wolfOne.color + "\n"
            + "Wolf sex: " + wolfOne.sex + "\n"
            + "Wolf weight: " + wolfOne.weight + "\n");
        
        wolfOne.go();
        wolfOne.sit();
        wolfOne.howl();
        wolfOne.hunt();
        wolfOne.run();
    }    
}
