package org.example;

public class Dog extends Animal{
String breed;

    public Dog(int age, String name, String color, String breed) {
        super(age, name, color);
        this.breed = breed;
    }

    @Override
    public void print() {
        System.out.println("Age: " + age + "\nColor: " + color + "\nName: " + name + "\nBreed: "+ breed);
    }
}
