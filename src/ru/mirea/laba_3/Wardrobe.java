package ru.mirea.laba_3;

public class Wardrobe extends Furniture{
    protected String colour;
    protected double length;
    protected double width;
    protected double height;

    public Wardrobe() {}

    public Wardrobe(String colour, double length, double width, double height) {
        this.colour = colour;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Wardrobe(boolean availability, int quantity, String colour, double length, double width, double height) {
        super(availability, quantity);
        this.colour = colour;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String Size() {
        return "" + (length * width * height) + " m^3";
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "availability=" + availability +
                ", quantity=" + quantity +
                ", colour='" + colour + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
