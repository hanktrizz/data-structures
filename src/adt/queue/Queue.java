package adt.queue;

public interface Queue<T> {
    void enqueue(T item) throws Exception;

    T dequeue() throws Exception;

    T head();

    T tail();
}
