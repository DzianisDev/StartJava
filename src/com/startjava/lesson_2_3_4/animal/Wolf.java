package com.startjava.lesson_2_3_4.animal;

public class Wolf {

    private String sex;
    private String color;
    private String name;
    private int age;
    private float weight;

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        if (sex != "") {
            this.sex = sex;
        } else {
            System.out.println("Sex not be empty!");
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != "") {
            this.color = color;
        } else {
            System.out.println("Color not be empty!");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != "") {
            this.name = name;
        } else {
            System.out.println("Name not be empty!");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Incorrect age");
        }
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Incorrect weight");
        }
    }

    public void go() {
        System.out.println(name + " is going");
    }

    public void sit() {
        System.out.println(name + " is sitting");
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void howl() {
        System.out.println("* " + name + " is howling");
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }

}
