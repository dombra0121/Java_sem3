package ru.mirea.practika8;

/**
 * Класс очереди с константой
 * Максимум {@link BoundedWaitList#capacity}.
 * @author Ivan
 * @version 1.0
 * @param <E> Тип хранения данных
 * @see WaitList
 */
public class BoundedWaitList<E> extends WaitList<E> {

    /**
     * Поле для максимального размера очереди
     */
    private int capacity;

    /**
     * Перегруженный конструктор
     * @param capacity Максимум {@link BoundedWaitList#capacity} очереди
     * @throws IllegalStateException
     * @see WaitList#WaitList()
     */
    public BoundedWaitList(int capacity) {
        super();
        if (capacity == 0)
            throw new IllegalStateException("Максимальный размер не должен быть нулевым!");
        this.capacity = capacity;
    }

    /**
     *Метод получения размера очереди {@link BoundedWaitList#capacity}
     * @return Значение {@link BoundedWaitList#capacity}.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Метод добавления элемента в очередь
     * @param element Добавляемое значение
     * @throws IllegalStateException
     * @see WaitList#add(Object)
     */
    @Override
    public void add(E element) {
        if (collection.size() == capacity)
            throw new IllegalStateException("Очередь заполнена!");
        super.add(element);
    }

    /**
     * Метод получения информации о списке в виде строки
     * @return Строковое значение в этом листе
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "BoundedWaitList {" +
                " capacity = " + capacity +
                ", collection = " + collection +
                '}';
    }
}