package ru.mirea.laba_5;
import javax.swing.*;
import java.awt.*;


public class Figures extends JFrame {
    JPanel panel;
    Shape sh;

    public Figures() {
        setTitle("Figures");
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        sh = new Shape();
        panel.add(sh);
        setContentPane(panel);
        setSize(1000, 1000);
        setVisible(true);
    }
}