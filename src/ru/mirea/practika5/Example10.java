package ru.mirea.practika5;

public class Example10 {
    public static int foo(int n, int i) {
        if (n == 0) return i; // базовый случай
        else return foo(n / 10, i * 10 + n % 10);
    }
    public static void main(String[] args){
        System.out.println(foo(789, 1));
        System.out.println(foo(12345, 0));
    }

    // foo(789, 0) -> foo(78, 9) -> foo(7, 90 + 8 = 98) -> foo(0, 980 + 7 = 987) ----> return 987
}
