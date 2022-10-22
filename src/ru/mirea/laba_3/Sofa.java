package ru.mirea.laba_3;

public class Sofa extends Furniture {
    protected String colour;
    protected double length;
    protected double width;

    public Sofa() {
    }

    public Sofa(String colour, double length, double width) {
        this.colour = colour;
        this.length = length;
        this.width = width;
    }

    public Sofa(boolean availability, int quantity, String colour, double length, double width) {
        super(availability, quantity);
        this.colour = colour;
        this.length = length;
        this.width = width;
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

    @Override
    public String Size() {
        return "" + length * width + " m^2";
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "availability=" + availability +
                ", quantity=" + quantity +
                ", colour='" + colour + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
