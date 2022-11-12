package ru.mirea.laba_10.ex1;

import java.util.ArrayList;

// 2-й способ
public class TestGenericMethod {
    public static <E> void ArrayToArrayList(E[] a, ArrayList<E> lst) {
        for (E e : a) lst.add(e);
    }

    // Тестирование 2-го способа
    public static void main(String[] args) {
        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        ArrayList<String> lst2 = new ArrayList<String>();

        Integer[] intArray = {1, 2, 3};
        TestGenericMethod.<Integer>ArrayToArrayList(intArray, lst1);
        for (Integer i : lst1) System.out.print(i + " ");
        System.out.println();

        String[] strArray = {"one", "two", "three"};
        TestGenericMethod.<String>ArrayToArrayList(strArray, lst2);
        for (String i : lst2) System.out.print(i + " ");
    }
}
