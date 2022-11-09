package ru.mirea.practika4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class Game extends JFrame {
    JPanel[] panels;
    int resMilan, resMadrid;
    String winner;
    JLabel res, lastScore, win;

    {
        panels = new JPanel[6];
        resMilan = 0; resMadrid = 0;
        winner = "N/A";
        res = new JLabel("Results " + resMilan + " X " + resMadrid, SwingConstants.CENTER);
        res.setForeground(Color.WHITE);
        lastScore = new JLabel("Last score: N/A", SwingConstants.CENTER);
        lastScore.setForeground(Color.WHITE);
        win = new JLabel(winner, SwingConstants.CENTER);
        win.setForeground(Color.WHITE);
    }   //блок инициализатора

    public Game() {
        setSize(600, 600);
        setLayout(new GridLayout(3, 2));
        setTitle("Milan and Madrid match");

        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new BorderLayout());
            add(panels[i]);
        }   //инициализация панелей

        JButton butMil = new JButton("AC Milan");
        panels[0].add(butMil, BorderLayout.CENTER);

        JButton butMad = new JButton("Real Madrid");
        panels[1].add(butMad, BorderLayout.CENTER);

        panels[2].add(res, BorderLayout.CENTER);
        panels[2].setBackground(Color.BLUE);

        panels[3].add(lastScore, BorderLayout.CENTER);
        panels[3].setBackground(Color.BLUE);

        JLabel winner1 = new JLabel("Winner", SwingConstants.CENTER);
        winner1.setForeground(Color.WHITE);
        panels[4].add(winner1, BorderLayout.CENTER);
        panels[4].setBackground(Color.RED);

        panels[5].add(win, BorderLayout.CENTER);
        panels[5].setBackground(Color.RED);


        butMil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                resMilan++;
                setRes();
                setLS("AC Milan");
                calcWin();
            }
        });

        butMad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                resMadrid++;
                setRes();
                setLS("Real Madrid");
                calcWin();
            }
        });
    }

    public void setRes() {
        res.setText("Results " + resMilan + " X " + resMadrid);
        panels[2].remove(res);
        panels[2].add(res, BorderLayout.CENTER);
    }

    public void setLS(String command) {
        lastScore.setText("Last score: " + command);
        panels[3].remove(lastScore);
        panels[3].add(lastScore, BorderLayout.CENTER);
    }

    public void calcWin() {
        if (resMadrid > resMilan) winner = "Real Madrid";
        else if (resMadrid < resMilan) winner = "AC Milan";
        else winner = "Draw";
        win.setText(winner);
        panels[5].remove(win);
        panels[5].add(win, BorderLayout.CENTER);
    }
}