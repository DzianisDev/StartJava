package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Model not be empty!");
        } else {
            this.modelName = modelName;
        }

    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        if (mark == "") {
            System.out.println("Mark not be empty!");
        } else {
            this.mark = mark;
        }
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setOrigin(String origin) {
        if (origin == "") {
            System.out.println("Origin not be empty");
        } else {
            this.origin = origin;
        }
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        if (height <= 0) {
            System.out.println("Incorrect height");
        } else {
            this.height = height;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0) {
            System.out.println("Incorrect weight");
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            System.out.println("Incorrect speed");
        } else {
            this.speed = speed;
        }
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        if (strength <= 0) {
            System.out.println("Incorrect strength");
        } else {
            this.strength = strength;
        }
    }

    public int getArmor() {
        return this.armor;
    }

    public void setArmor(int armor) {
        if (armor <= 0) {
            System.out.println("Incorrect armor");
        } else {
            this.armor = armor;
        }
    }

    public boolean drift() {
        System.out.println("Drift activated");
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {
        System.out.println("You're use vortex");
    }
}
