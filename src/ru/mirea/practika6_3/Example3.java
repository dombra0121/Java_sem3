package ru.mirea.practika6_3;

public class Example3 {
    public static int[] sortArray(int[] array) { // ���������� ������� ������� ���������� � �������
        if (array == null) {
            return null;
        }

        if (array.length < 2) { // ��������� �� 1 �� ������� � �������?
            return array;
        }

        // �������� ����� ����� �� ������ �� ��������
        int[] arrayB = new int[array.length / 2];
        System.arraycopy(array, 0, arrayB, 0, array.length / 2);

        // �������� ������ ����� �� �������� �� ����� �������
        int[] arrayC = new int[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, arrayC, 0, array.length - array.length / 2);


        sortArray(arrayB);
        sortArray(arrayC);

        mergeArray(array, arrayB, arrayC);
        return array;
    }

    private static void mergeArray(int[] array, int[] arrayB, int[] arrayC) {

        int positionB = 0, positionC = 0; // ��� ����� �������� �������� � ��������

        for (int i = 0; i < array.length; i++) {
            if (positionB == arrayB.length) {
                array[i] = arrayC[positionC]; // "����������� �������� �� ������� arrayC"
                positionC++;
            } else if (positionC == arrayC.length) {
                array[i] = arrayB[positionB]; // "����������� �������� �� ������� arrayB"
                positionB++;
            } else if (arrayB[positionB] < arrayC[positionC]) {
                array[i] = arrayB[positionB];
                positionB++;
            } else {
                array[i] = arrayC[positionC];
                positionC++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Student numbers in ascending order:");
        int[] array1 = {567, 143, 600, 213, 300, 476};
        int[] array2 = {188, 986, 783, 415, 565, 609};
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        sortArray(array3);
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
