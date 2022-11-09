package ru.mirea.practika8;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
/**
 * Базовый класс WaitList с базовой функциональностью
 * @author Ivan
 * @version 1.0
 * @param <E> Тип хранения данных
 * @see IWaitList
 */
public class WaitList<E> implements IWaitList<E> {
    /**
     * Поле для хранения данных
     */
    protected ConcurrentLinkedQueue<E> collection;

    /**
     * Конструктор
     * @see WaitList#WaitList(ConcurrentLinkedQueue)
     */
    public WaitList() {
        collection = new ConcurrentLinkedQueue<>();
    }

    /**
     * Перегруженный конструктор.
     * @param c Коллекция со значениями для хранения
     * @see WaitList#WaitList()
     */
    public WaitList(ConcurrentLinkedQueue<E> c) {
        collection = new ConcurrentLinkedQueue<>(c);
    }

    /**
     * Метод добавления элемента в конец очереди
     * @param element Значение добавляемого элемента
     * @see IWaitList#add(Object)
     * @see ConcurrentLinkedQueue#add(Object)
     */
    @Override
    public void add(E element) {
        collection.add(element);
    }

    /**
     * Метод удаления первого элемента очереди
     * @return Удаленный элемент
     * @throws IllegalStateException
     * @see IWaitList#remove()
     * @see ConcurrentLinkedQueue#remove()
     */
    @Override
    public E remove() {
        if (isEmpty())
            throw new IllegalStateException("Очередь пуста!");
        return collection.remove();
    }

    /**
     * Метод, проверяющий, есть ли элемент в очереди
     * <br>Сложность - O(n).
     * @param element Значение элемента
     * @return <i>true</i> если элемент найдет, иначе <i>false</i>.
     * @see IWaitList#contains(Object)
     */
    @Override
    public boolean contains(E element) {
        boolean flag = false;
        for(int i = 0; i < collection.size(); i++){
            E el = collection.remove();
            if(el.equals(element)) flag = true;
            collection.add(el);
        }
        return flag;
    }

    /**
     * Метод проверки, все ли элементы данной очереди совпадают с элементами текущей очереди
     * <br>Сложность - O(n<sup>2</sup>)
     * @param c Коллекция со значениями для поиска
     * @return <i>true</i> если элементы отсутствуют, иначе - <i>false</i>.
     * @see IWaitList#containsAll(Collection)
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        ArrayList<E> arr = new ArrayList<>(c);
        for (int i = 0; i < collection.size(); i++) {
            boolean flag = false;
            for (int j = 0; j < arr.size(); j++) {
                E element = collection.remove();
                if (element.equals(arr.get(i))) flag = true;
                collection.add(element);
            }
            if (!flag) return false;
        }
        return true;
    }

    /**
     * Метод проверяющий {@link WaitList#collection} на пустоту
     * @return <i>true</i> элементов нет, иначе <i>false</i>.
     * @see IWaitList#isEmpty()
     * @see ConcurrentLinkedQueue#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return collection.isEmpty();
    }


    /**
     * Метод для получения информации о списке в виде строки
     * @return Строковое значение этого списка
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return "WaitList { " +
                "collection = " + collection +
                '}';
    }
}