package adt.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

/**
 * LinkedList can be easily utilised to implement a Stack due to the
 * nature of the former's implementation and behaviour. Here, an
 * out-of-the-box linked list is used instead of actually creating
 * a LinkedList implementation and then using it.
 *
 * @param <T> Generic type representing any object at runtime.
 */
public class ListStack<T> implements IStack<T> {

    private LinkedList<T> list = new LinkedList<T>();

    @Override
    public void push(T item) {
        list.addLast(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new EmptyStackException();
        return list.removeLast();
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new EmptyStackException();
        return list.peekLast();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void clear() {
        list.clear();
    }
}
