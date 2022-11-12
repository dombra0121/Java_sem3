package ru.mirea.laba_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    JPanel[] panels;
    JLabel text; // поле для основной надписи
    JTextField jtf; // поле для ввода текста
    JButton guess; // поле кнопки с надписью
    int randNumber, countOfAttempt;

    // инициализация панели
    {
        panels = new JPanel[3];
        text = new JLabel("Try to guess the number from 0 to 20:", SwingConstants.CENTER);
        Font fnt = new Font("Times new Roman", Font.PLAIN, 20);
        Font textFont = new Font("Times new Roman", Font.PLAIN, 50);
        text.setFont(fnt);
        jtf = new JTextField(SwingConstants.CENTER);
        jtf.setFont(textFont);
        jtf.setForeground(Color.BLACK);
        guess = new JButton("Enter a number");
        guess.setFont(fnt);
        randNumber = (int) (Math.random() * 21);
        countOfAttempt = 0;
    }

    public Game() {
        setLayout(new GridLayout(3, 1));
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new BorderLayout());
            add(panels[i]);
        }

        panels[0].add(text, BorderLayout.CENTER);
        panels[1].add(jtf, BorderLayout.CENTER);
        panels[2].add(guess, BorderLayout.CENTER);

        guess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String readString = jtf.getText();
                int readNumber = Integer.parseInt(readString);
                int substract = readNumber - randNumber;
                if ((substract == 0) & (countOfAttempt <= 3)) {
                    text.setText("You guessed it!");
                    jtf.setForeground(Color.GREEN);
                    panels[2].removeAll();
                    JLabel res = new JLabel("The game is over!", SwingConstants.CENTER);
                    Font fnt = new Font("Times new Roman", Font.PLAIN, 20);
                    res.setFont(fnt);
                    panels[2].add(res);
                } else if ((substract > 0) && (countOfAttempt < 3)) {
                    countOfAttempt++;
                    text.setText("<html>You didn't guess! This number is smaller. Try again! <p/>There are " + (3 - countOfAttempt) + " attempts left" + "</html>");
                    jtf.setForeground(Color.RED);
                } else if ((substract < 0) && (countOfAttempt < 3)) {
                    countOfAttempt++;
                    text.setText("<html>You didn't guess! This number is bigger. Try again! <p/>There are " + (3 - countOfAttempt) + " attempts left" + "</html>");
                    jtf.setForeground(Color.RED);
                } else if (countOfAttempt == 3) {
                    text.setText("You didn't guess! the number " + randNumber + " was guessed");
                    countOfAttempt++;
                } else {
                    text.setText("Don't try again! You had 3 attempts!");
                }
            }
        });
        setSize(500, 400);
    }
}
