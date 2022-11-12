package ru.mirea.laba_10.ex2_3_4;

import java.util.Arrays;

public class GenericArray<E> {
    private int size; // количество элементов списка
    private E[] array;

    public GenericArray() {
        size = 0;
        array = (E[]) new Object[size];
    }

    public GenericArray(int size) {
        this.size = size;
        array = (E[]) new Object[size];
    }

    public GenericArray(int size, E[] array) {
        this.size = size;
        this.array = array;
    }

    public boolean add(E element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == null) {
                array[i] = element;
                return true;
            }
        }
        array = Arrays.copyOf(array, size + 1);
        array[size] = element;
        size++;
        return true;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public E get(int index) {
        try {
            return array[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
            return null;
        }
    }

    public int indexOf(E element) {
        if (isEmpty()) throw new IllegalStateException("Array is empty!");
        for (int i = 0; i < size; i++)
            if (array[i].equals(element))
                return i;
        return -1;
    }

    @Override
    public String toString() {
        return "GenericArray{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
