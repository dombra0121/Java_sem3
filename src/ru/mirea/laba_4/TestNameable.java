package ru.mirea.laba_4;

public class TestNameable {
    public static void main(String[] args) {
        Person person = new Person("Maria", 15);
        person.setAge(19);
        System.out.println("person's name: " + person.getName());

        Car car = new Car("black", "Tesla", 2021);
        System.out.println("car brand: " + car.getName());
        System.out.println("year of release: " + car.getYearOfRelease());
    }
}
