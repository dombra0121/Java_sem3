package ru.mirea.practika5;

import java.util.Scanner;

public class Example9 {
    public static int foo(int a, int b) { // a - 0, b - 1
        // Базовые случаи
        if (a > b + 1) return 0; // кол-во нулей больше кол-ва единиц на 1 (например, 4 нуля и 2 единицы)
        if (a == 0 || b == 0) return 1; // если нет единиц или нулей, возможна только одна последовательность

        // Шаг рекурсии
        return foo(a, b - 1) + foo(a - 1, b - 1);
    }
    public static void main(String[] args) {

        System.out.println(foo(2, 3)); // вызов рекурсивной функции
    }
}
