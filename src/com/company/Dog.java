package com.company;

public class Dog extends Animal {

  public Dog(String name){
    super(name);
  }

  public void makeSound(){
    System.out.println("Wuff");
  }

  public boolean eat(String foodType) {
    return true;
  }

  @Override
  public void mood(boolean mood) {
    if(mood == true){
      System.out.println("logrer");
    } else System.out.println("knurrer");
  }
}
