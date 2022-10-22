package ru.mirea.laba_7;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<Company> companies = new LinkedList<>();
        Company Yandex = new Company("Yandex");
        Company Tinkoff = new Company("Tinkoff");
        Company Sber = new Company("Sber");
        Company JetBrains = new Company("JetBrains");
        Company Microsoft = new Company("Microsoft");

        companies.add(Yandex);
        companies.add(Tinkoff);
        companies.add(Sber);
        System.out.println(companies);

        companies.addFirst(JetBrains); // добавление элемента в начало списка
        companies.addLast(Microsoft); // добавление элемента в конец списка
        System.out.println(companies);

        System.out.println(companies.peekFirst()); // возврат первого элемента списка
        System.out.println(companies.peekLast()); // возврат последнего элемента списка

        companies.remove(Sber); // удаление элемента из списка
        companies.remove(1); // удаление элемента из списка по индексу
        System.out.println(companies);

        System.out.println(companies.indexOf(JetBrains)); // получение индекса элемента

        System.out.println(companies.get(1)); // получение самого элемента
        System.out.println(companies.getFirst());
        System.out.println(companies.getLast());

        Company Apple = new Company("Apple");
        companies.set(2, Apple); // изменение элемента
        System.out.println(companies);

        System.out.println(companies.contains(Yandex)); // проверка наличия конкретного элемента
        System.out.println(companies.contains(Tinkoff)); // проверка наличия конкретного элемента

        System.out.println(companies.clone()); // вывод копии объекта companies
        Object companies1 = companies.clone(); // Создание копии, затем вывод
        System.out.println(companies1);
        System.out.println(companies.size());

        companies.clear();
        System.out.println(companies);
        System.out.println(companies.isEmpty());

    }
}
