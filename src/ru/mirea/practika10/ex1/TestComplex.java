package ru.mirea.practika10.ex1;

public class TestComplex {
    public static void main(String[] arg) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        System.out.println(concreteFactory.createComplex());
        System.out.println(concreteFactory.CreateComplex(5, 7));
    }
}
