package ru.mirea.practika8;

/**
 * Класс очереди с дополнительным функционалом:
 * <br>Удаление элемента из любого места очереди
 * <br>Перемещение найденного элемента в конец очереди
 * @author Ivan
 * @version 1.0
 * @param <E> Тип хранения данных
 * @see WaitList
 */
public class UnfairWaitList<E> extends WaitList<E> {

    /**
     * Конструктор
     * @see WaitList
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * Метод удаления элемента очереди
     * <br>Сложность - O(n).
     * @param element Значение для поиска и удаления
     * @see WaitList#remove()
     */
    public void remove(E element) {
        boolean flag = false;
        for (int i = 0; i < collection.size(); i++) {
            E el = collection.remove();
            if (!flag && el.equals(element)) {
                flag = true;
                break;
            } else collection.add(el);
        }
    }

    /**
     * Метод перемещения элемента в конец очереди
     * <br>Используем {@link UnfairWaitList#remove(Object)}
     * и {@link WaitList#add(Object)}.
     * @param element Значение перемещаемого элемента
     */
    public void moveToBack(E element) {
        int prevSize = collection.size();
        remove(element);
        if (collection.size() < prevSize)
            collection.add(element);
    }
}
