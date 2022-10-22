package ru.mirea.practika3_2;

public class Rectangle extends Shape{
    protected Double width;
    protected Double length;
    public Rectangle(){}
    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(Double width, Double length, String color, Boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public Double getWidth() {
        return width;
    }

    public Double getLength() {
        return length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getArea() {
        return width * length;
    }

    public Double getPerimetr() {
        return 2 * width + 2 * length;
    }
    public String toString() {
        return "Shape: rectangle, width: " + this.width + ", " + " length: " + this.length + "color: " + this.color;
    }
}
