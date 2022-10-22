package ru.mirea.practika7;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args){
        int n = 10;
        Stack<Integer> player1 = new Stack<>();
        Stack<Integer> player2 = new Stack<>();
        Scanner in = new Scanner(System.in);
        int karta;
        for (int i = 0; i < n / 2; ++i) {
            karta = in.nextInt();
            player1.add(0, karta);
        }

        for (int i = 0; i < n / 2; ++i) {
            karta = in.nextInt();
            player2.add(0, karta);
        }

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int p1 = player1.lastElement();
            int p2 = player2.lastElement();
            player1.pop();
            player2.pop();
            if (p1 == 0 && p2 == 9) {
                player1.add(0, p1);
                player1.add(0, p2);
            }
            else if (p2 == 0 && p1 == 9) {
                player2.add(0, p2);
                player2.add(0, p1);
            }
            else if (p1 > p2) {
                player1.add(0, p1);
                player1.add(0, p2);
            }
            else {
                player2.add(0, p2);
                player2.add(0, p1);
            }
            moves++;
        }

        if (moves == 106) System.out.println("botva");
        else if (player1.isEmpty()) System.out.println("Second " + moves);
        else if (player2.isEmpty()) System.out.println("First " + moves);
    }
}
