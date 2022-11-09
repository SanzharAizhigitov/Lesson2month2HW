package org.example;

public abstract class Animal implements Printable {
    int age;
    String name;
    String color;

    public Animal(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
}
