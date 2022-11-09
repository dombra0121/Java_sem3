package ru.mirea.practika8;
import java.util.Collection;

/**
 * Интерфейс IWaitList с методами для реализации.
 * @author Ivan
 * @version 1.0
 * @param <E> Тип хранения данных
 */
public interface IWaitList<E> {

    /**
     * Метод добавления элемента в конец очереди
     * @param element Значение элемента, которое необходимо добавить
     * */
    void add(E element);

    /**
     * Метод удаления первого элемента очереди
     * @return удалённый элемент
     */
    E remove();

    /**
     * Метод проверки, имеется ли данный элемент в очереди или нет
     * @param element Значение элемента, которое необходимо проверить
     * @return <i>true</i> если найден элемент, иначе <i>false</i>.
     */
    boolean contains(E element);

    /**
     * Метод проверки, все ли элементы коллекции включены в очередь
     * @param c Коллекция со значениями для поиска
     * @return <i>true</i> если найдены все элементы, иначе <i>false</i>.
     */
    boolean containsAll(Collection<E> c);

    /**
     * Метод проверки очереди на пустоту
     * @return <i>true</i> если элементы отсутствуют, иначе - <i>false</i>
     */
    boolean isEmpty();
}
