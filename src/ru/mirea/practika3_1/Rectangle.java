package ru.mirea.practika3_1;

public class Rectangle extends Shape{
    private float a;
    private float b;

    Rectangle(float x, float y, float a, float b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }
    public float P(){
        return a * 2 + b * 2;
    }

    public void getAll() {
        System.out.println(a + " " + b);
    }
}
