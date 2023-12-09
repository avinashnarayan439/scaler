package org.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("its my first gradle project");
        Fruit fruit=new Fruit("red","sweet");
        System.out.println(fruit.isTasty());
    }
}