package adt.list;

public interface IList<T> {
    void add(T item);

    void add(T item, int index);

    boolean contains(T item);

    int size();

    boolean isEmpty();

    T get(int index);

    T remove(int index);
}
