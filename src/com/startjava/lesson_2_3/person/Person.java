package com.startjava.lesson_2_3.person;
public class Person {
    char gender = 'm';
    String name = "Dzianis";
    float height = 1.85f;
    float weight = 71.0f;
    int age = 24;
    
    void move() {
        System.out.println("You're moving");
    }

    boolean sit() {
        return true;
    }

    void run() {
        System.out.println("You're running");
    }

    void learnJava() {
        System.out.println("Now, you're learning java");
    }

    boolean speak() {
        return true;
    }
}
