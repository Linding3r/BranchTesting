package com.company;

public class Main {

  public static void main(String[] args) {
    Dog dog1 = new Dog("Lasse");
    Cat cat1 = new Cat("Morten");

    cat1.makeSound();
    dog1.makeSound();

    System.out.println(dog1.eat("shit"));
    System.out.println(cat1.eat("FIsh"));

    dog1.mood(false);
    dog1.mood(true);
    cat1.mood(false);
    cat1.mood(true);

  }
}
