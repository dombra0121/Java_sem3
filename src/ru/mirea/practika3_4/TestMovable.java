package ru.mirea.practika3_4;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint Point1 = new MovablePoint(2, 4, 1, 1);
        System.out.println(Point1.toString());
        Point1.moveLeft();
        Point1.moveUp();
        System.out.println(Point1.toString() + "\n");

        MovableCircle circle = new MovableCircle(1, 1, 2, 4, 5);
        System.out.println(circle.toString());
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle.toString() + "\n");

        MovableRectangle rectangle = new MovableRectangle(-1, 1, 4, -3, 1, 1);
        System.out.println(rectangle.toString());
        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println(rectangle.toString());
    }
}
