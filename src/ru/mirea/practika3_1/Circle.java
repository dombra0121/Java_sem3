package ru.mirea.practika3_1;

public class Circle extends Shape{
    private float r;
    Circle(float x, float y, float r) {
        super(x, y);
        this.r = r;
    }
    public float P() {
        return (float) (2 * Math.PI * r);
    }
    public void getAll(){
        System.out.println(r);
    }
}
