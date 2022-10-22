package ru.mirea.practika3_2;

public class Circle extends Shape{
    protected Double radius;

    public Circle(){}
    public Circle(Double radius) {
        this.radius = radius;
    }
    public Circle(Double radius, String color, Boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return Math.PI * radius * radius;
    }

    public Double getPerimetr() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", " + "color: " + this.color;
    }
}
