package adt.stack;

public interface IStack<T> {
    void push(T item);

    T pop();

    T peek();

    int size();

    boolean isFull();

    boolean isEmpty();
}
