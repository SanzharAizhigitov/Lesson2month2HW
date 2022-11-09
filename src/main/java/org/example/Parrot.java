package org.example;

public class Parrot extends Animal{
    int flightSpeed;

    public Parrot(int age, String name, String color, int flightSpeed) {
        super(age, name, color);
        this.flightSpeed = flightSpeed;
    }

    @Override
    public void print() {
        System.out.println("Age: " + age + "\nColor: " + color + "\nName: " + name + "\nFlight speed: "+ flightSpeed);
    }
}
