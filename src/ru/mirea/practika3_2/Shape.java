package ru.mirea.practika3_2;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape(){}
    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract Double getArea();
    public abstract Double getPerimetr();
    public String toString() {
        return "color: " + this.color + "; filled: " + this.filled;
    }
}
