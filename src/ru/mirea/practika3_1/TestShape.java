package ru.mirea.practika3_1;

public class TestShape {
    public static void main(String[] args) {
        Rectangle Rectangle = new Rectangle(0, 0, 5, 2);
        Rectangle.getAll();
        System.out.println("Perimetr: " + Rectangle.P());

        Circle Circle = new Circle(0, 0, 4);
        Circle.getAll();
        System.out.println("Length: " + Circle.P());
    }
}
