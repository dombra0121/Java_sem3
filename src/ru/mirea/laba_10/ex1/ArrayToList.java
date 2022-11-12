package ru.mirea.laba_10.ex1;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

// 1-й способ
public class ArrayToList<E> {
    private List<E> list = new ArrayList<>();

    public ArrayToList(E[] array) {
        list.addAll(asList(array)); // asList формирует список на основе массива,
                                    // addAll добавляет элементы одной коллекции в другую
    }

    @Override
    public String toString() {
        return "ArrayToList{" +
                "list=" + list +
                '}';
    }
}
