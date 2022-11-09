package org.example;

public class Main {
    public static void main(String[] args) {
createObject(Classes.DOG, 5, "Sharik", "Brown", "Haski", 0, 0);
createObject(Classes.CAT, 3, "Myrsik", "White", "", 8, 0 );
createObject(Classes.PARROT, 4, "Pirat", "Green", "", 0 ,2);

}
    public static Animal createObject(Classes typeOfClass,int age, String name, String color, String breed, int numberOfRemainingLives, int flightSpeed) {
        if (typeOfClass == Classes.CAT) {
            Cat cat = new Cat(age, name, color, numberOfRemainingLives);
            cat.print();
            return cat;
        } else if (typeOfClass == Classes.DOG) {
            Dog dog = new Dog(age, name, color, breed);
            dog.print();
            return dog;
        } else if (typeOfClass == Classes.PARROT) {
            Parrot parrot = new Parrot(age, name, color, flightSpeed);
            parrot.print();
            return parrot;
        }
        else{ return null;}


    }}