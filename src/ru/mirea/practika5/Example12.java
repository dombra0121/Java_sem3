package ru.mirea.practika5;

import java.util.Scanner;

public class Example12 {
    public static void foo() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n != 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                foo();
                //System.out.println(n);
            }
            else foo();
        }
    }
    public static void main(String[] args) {
        foo();
    }
}
