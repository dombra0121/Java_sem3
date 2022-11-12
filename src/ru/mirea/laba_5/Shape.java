package ru.mirea.laba_5;

import java.awt.*;

public class Shape extends Shapes {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 20; i++) {
            int choise = (int) (Math.random() * 5);
            g2.setPaint(randColor());
            if (choise == 0)
                g2.fillRect(rand(800, 50), rand(800, 50), rand(100, 50), rand(100, 50));
            else if (choise == 1)
                g2.fillOval(rand(800, 50), rand(800, 50), rand(100, 50), rand(100, 50));
            else if (choise == 2)
                g2.fillArc(rand(800, 50), rand(800, 50), rand(100, 50), rand(100, 50),
                        rand(800, 50), rand(800, 50));
            else if (choise == 3){
                int rand1 = rand(700, 50);
                int rand2 = rand(700, 50);
                int rand3 = rand(70, 20);
                int x[] = {rand1, rand1 + rand3, rand1 + rand3 * 2};
                int y[] = {rand2, rand2 - rand3, rand2};
                g2.fillPolygon(x, y, 3);
            }
            else {
                int rand1 = rand(700, 50);
                int rand2 = rand(700, 50);
                int rand3 = rand(70, 20);
                int x[] = {rand1, rand1 + rand3, rand1 + rand3 * 2, rand1 + rand3};
                int y[] = {rand2, rand2 - rand3, rand2, rand2 + rand3};
                g2.fillPolygon(x, y, 4);
            }
        }
    }
}

