package ru.mirea.laba_10.ex1;

// Тестирование 1-го способа
public class TestArrayToList {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayToList<Integer> arrInt = new ArrayToList<>(numbers);
        System.out.println(arrInt);

        String[] strings = {"red", "orange", "black", "white", "green"};
        ArrayToList<String> arrString = new ArrayToList<>(strings);
        System.out.println(arrString);
    }
}
