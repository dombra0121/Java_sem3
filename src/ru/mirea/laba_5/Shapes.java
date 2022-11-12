package ru.mirea.laba_5;

import javax.swing.*;
import java.awt.*;

public abstract class Shapes extends JComponent {
    protected Color randColor() {
        int r = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        return new Color(r, g, b);
    }
    protected int rand(int max, int min) {
        return (int) (Math.random() * max) + min;
    }
}
