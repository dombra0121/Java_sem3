package ru.mirea.practika3_2;

public class Square extends Rectangle{
    protected Double side;
    public Square(){}
    public Square(Double side) {
        this.side = side;
    }
    public Square(Double side, String color, Boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Double getArea() {
        return side * side;
    }

    public Double getPerimetr() {
        return 4 * side;
    }
    public String toString() {
        return "Shape: square, side " + this.side + ", " + "color: " + this.color;
    }


}
