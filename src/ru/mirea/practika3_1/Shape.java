package ru.mirea.practika3_1;

public abstract class Shape {
    float x;
    float y;
    Shape(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public abstract float P();
    public abstract void getAll();
}
