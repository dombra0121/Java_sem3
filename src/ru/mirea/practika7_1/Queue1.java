package ru.mirea.practika7_1;

import java.util.*;

public class Queue1 {

    public static void main(String[] args){
        int n = 10;
        Queue<Integer> player1 = new LinkedList<>();
        Queue<Integer> player2 = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int karta;
        for (int i = 0; i < n / 2; ++i) {
            karta = in.nextInt();
            player1.add(karta);
        }

        for (int i = 0; i < n / 2; ++i) {
            karta = in.nextInt();
            player2.add(karta);
        }

        int moves = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && moves < 106) {
            int p1 = player1.poll();
            int p2 = player2.poll();
            if (p1 == 0 && p2 == 9) {
                player1.add(p1);
                player1.add(p2);
            }
            else if (p2 == 0 && p1 == 9) {
                player2.add(p2);
                player2.add(p1);
            }
            else if (p1 > p2) {
                player1.add(p1);
                player1.add(p2);
            }
            else {
                player2.add(p2);
                player2.add(p1);
            }
            moves++;
        }

        if (moves == 106) System.out.println("botva");
        else if (player1.isEmpty()) System.out.println("Second " + moves);
        else if (player2.isEmpty()) System.out.println("First " + moves);
    }
}
