package ru.mirea.practika8;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] arg) {
        // Тестирование WaitList
        WaitList<String> waitList = new WaitList<>();
        waitList.add("Tinkoff");
        waitList.add("Yandex");
        waitList.add("Sber");
        waitList.add("VK");
        System.out.println(waitList);
        System.out.println(waitList.isEmpty());
        System.out.println(waitList.contains("Yandex"));
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Tinkoff");
        arr1.add("Yandex");
        arr1.add("Sber");
        arr1.add("VK");
        System.out.println(waitList.containsAll(arr1));
        waitList.remove();
        System.out.println(waitList + "\n");

        // Тестирование BoundedWaitList
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(4);
        boundedWaitList.add("Tinkoff");
        boundedWaitList.add("Yandex");
        boundedWaitList.add("Sber");
        boundedWaitList.add("VK");
        System.out.println(boundedWaitList);
        boundedWaitList.remove();
        boundedWaitList.add("JetBrains");
        System.out.println(boundedWaitList + "\n");

        // Тестирование UnfairWaitList
        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add("Tinkoff");
        unfairWaitList.add("Yandex");
        unfairWaitList.add("Sber");
        unfairWaitList.add("VK");
        System.out.println(unfairWaitList.toString());
        unfairWaitList.remove("Sber");
        System.out.println(unfairWaitList.toString());
        unfairWaitList.moveToBack("Tinkoff");
        System.out.println(unfairWaitList.toString());
    }
}
