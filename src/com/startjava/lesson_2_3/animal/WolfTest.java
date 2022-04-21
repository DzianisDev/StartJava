package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setName("Wolfhound");
        wolfOne.setAge(3);
        wolfOne.setColor("Grey");
        wolfOne.setSex("Male");
        wolfOne.setWeight(3.4f);

        System.out.println("Wolf name: " + wolfOne.getName() + "\n"
                + "Wolf age: " + wolfOne.getAge() + "\n"
                + "Wolf color: " + wolfOne.getColor() + "\n"
                + "Wolf sex: " + wolfOne.getSex() + "\n"
                + "Wolf weight: " + wolfOne.getWeight() + "\n");

        wolfOne.go();
        wolfOne.sit();
        wolfOne.howl();
        wolfOne.hunt();
        wolfOne.run();
    }
}
