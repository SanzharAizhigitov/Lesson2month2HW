package org.example;

public class Cat extends Animal{
int numberOfRemainingLives;

    public Cat(int age, String name, String color, int numberOfRemainingLives) {
        super(age, name, color);
        this.numberOfRemainingLives = numberOfRemainingLives;
    }

    @Override
    public void print() {
        System.out.println("Age: " + age + "\nColor: " + color + "\nName: " + name + "\nNumber of remaining lives: "+ numberOfRemainingLives);
    }
}
