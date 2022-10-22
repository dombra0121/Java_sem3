package ru.mirea.laba_4;

public class Cat implements Nameable{
    private String name;
    private int age;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int Get_age() {
        return age;
    }

    public void Set_age(int age) {
        this.age = age;
    }

    public void Set_name(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
