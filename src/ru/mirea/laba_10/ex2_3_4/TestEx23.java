package ru.mirea.laba_10.ex2_3_4;

public class TestEx23 {
    public static void main(String[] arg) {
        GenericArray<Integer> arrInt = new GenericArray<>(5);
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(4);
        arrInt.add(5);
        System.out.println(arrInt.getSize());
        arrInt.add(6);
        System.out.println(arrInt.getSize());
        System.out.println(arrInt.get(1));
        System.out.println(arrInt.indexOf(2));
        
        String[] arr = {"one", "two", "three"};
        GenericArray<String> arrString = new GenericArray<>(3, arr);
        System.out.println(arrString);
        arrString.add("four");
        System.out.println(arrString.getSize());
        System.out.println(arrString.isEmpty());
        System.out.println(arrString.get(7));
        System.out.println(arrString.indexOf("five"));
    }
}
