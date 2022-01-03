package adt.stack;

public class Stack<T> implements IStack<T> {

    private final int capacity;
    private final T[] stack;
    private int top = -1;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[this.capacity];
    }

    @Override
    public void push(T item) {
        if (!isFull()) {
            stack[++top] = item;
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) throw new java.util.EmptyStackException();

        T item = stack[top];

        stack[top--] = null;
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new java.util.EmptyStackException();

        return stack[top];
    }

    @Override
    public int size() {
        return this.top + 1;
    }

    @Override
    public boolean isFull() {
        return this.top + 1 == capacity;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
}
