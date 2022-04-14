public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Bracer Phoenix");
        jaegerOne.setMark("Mark-5");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(1.80f);
        jaegerOne.setWeight(70.3f);
        jaegerOne.setSpeed(4);
        jaegerOne.setStrength(9);
        jaegerOne.setArmor(8);
        System.out.println("Jaeger Model Name: " +jaegerOne.getModelName() + "\n"
            + "Jaeger Mark: " + jaegerOne.getMark() + "\n"
            + "Jaeger Origin: " + jaegerOne.getOrigin() + "\n"
            + "Jaeger Height: " + jaegerOne.getHeight() + "\n"
            + "Jaeger Weight: " + jaegerOne.getWeight() + "\n"
            + "Jaeger Speed: " + jaegerOne.getSpeed() + "\n"
            + "Jaeger Strength: " + jaegerOne.getStrength() + "\n"
            + "Jaeger Armor: " + jaegerOne.getArmor());
        System.out.println(jaegerOne.drift());
        jaegerOne.move();
        jaegerOne.useVortexCannon();          
    }    
}
