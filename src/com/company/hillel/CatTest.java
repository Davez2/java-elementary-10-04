package com.company.hillel;

public class CatTest {

    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.name = "Harry";
        cat.age = 8;
        cat.color = "Brown";

        System.out.println("Cat :" + cat.name + "," + cat.age + "," + cat.color);
    }

    public void Cat(String name, int age, String color) {


    }
}

