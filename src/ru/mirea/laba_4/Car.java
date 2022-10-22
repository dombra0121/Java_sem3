package ru.mirea.laba_4;

public class Car implements Nameable{
    protected String colour;
    protected String name;
    protected int yearOfRelease;

    public Car(String colour, String name, int yearOfRelease) {
        this.colour = colour;
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBrand(String brand) {
        this.name = brand;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String getName() {
        return name;
    }
}
