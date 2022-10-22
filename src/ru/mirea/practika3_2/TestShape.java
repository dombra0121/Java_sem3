package ru.mirea.practika3_2;

public class TestShape {
    public static void main(String[] args) {
        Circle Circle = new Circle(2.5, "black", true);
        System.out.println(Circle.getArea());
        System.out.println(Circle.getPerimetr());
        System.out.println(Circle.toString() + "\n");

        Rectangle Rectangle = new Rectangle(5.0, 8.0, "yellow", true);
        System.out.println(Rectangle.getArea());
        System.out.println(Rectangle.getPerimetr());
        System.out.println(Rectangle.toString() + "\n");

        Square Square = new Square(10.0, "red", true);
        System.out.println(Square.getArea());
        System.out.println(Square.getPerimetr());
        System.out.println(Square.toString());

        //---------------------------------------

//        Shape s1 = new Circle(5.5, "RED", false);
//        System.out.println(s1);
//        System.out.println(s1.getArea());
//        System.out.println(s1.getPerimeter()); // у класса Shape отсутствует метод getPerimeter
//        System.out.println(s1.getColor());
//        System.out.println(s1.isFilled());
//        System.out.println(s1.getRadius()); // у класса Shape отсутствует метод getRadius
//
//        Circle c1 = (Circle)s1;
//        System.out.println(c1);
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter()); // в методе getPerimeter используются поля, которые не проинициализированы
//        System.out.println(c1.getColor());
//        System.out.println(c1.isFilled());
//        System.out.println(c1.getRadius());
//
//        Shape s2 = new Shape(); //нельзя создавать экземпляр абстрактного класса
//
//        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
//        System.out.println(s3);
//        System.out.println(s3.getArea());
//        System.out.println(s3.getPerimeter()); // у класса Shape отсутствует метод getPerimeter
//        System.out.println(s3.getColor());
//        System.out.println(s3.getLength()); // у класса Shape отсутствует метод getLength
//
//        Rectangle r1 = (Rectangle)s3;
//        System.out.println(r1);
//        System.out.println(r1.getArea());
//        System.out.println(r1.getColor());
//        System.out.println(r1.getLength());
//
//        Shape s4 = new Square(6.6);
//        System.out.println(s4);
//        System.out.println(s4.getArea());
//        System.out.println(s4.getColor());
//        System.out.println(s4.getSide()); // у класса Shape отсутствует метод getSide
//
//// Take note that we downcast Shape s4 to Rectangle,
//// which is a superclass of Square, instead of Square
//        Rectangle r2 = (Rectangle)s4;
//        System.out.println(r2);
//        System.out.println(r2.getArea());
//        System.out.println(r2.getColor());
//        System.out.println(r2.getSide()); // у класса Rectangle отсутствует метод getPerimeter
//        System.out.println(r2.getLength());
//
//// Downcast Rectangle r2 to Square
//        Square sq1 = (Square)r2;
//        System.out.println(sq1);
//        System.out.println(sq1.getArea());
//        System.out.println(sq1.getColor());
//        System.out.println(sq1.getSide());
//        System.out.println(sq1.getLength());

    }
}
