package adt.queue;

/**
 * Array-based implementation of a finite Queue dictated by capacity.
 * All operations are O(1) Constant time.
 * The implementation can be thought of as a circular queue to avoid
 * insertion issues if used with normal indexing method.
 * @param <T>
 */
public class ArrayQueue<T> implements Queue<T> {
    T[] array;
    int front;
    int rear;
    int size;
    int capacity;

    public ArrayQueue(int capacity) {
        this.array = (T[]) new Object[capacity];
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    @Override
    public void enqueue(T item) throws Exception {
        if (this.size == capacity) throw new Exception("Queue is full");

        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size++;
    }

    @Override
    public T dequeue() throws Exception {
        if (this.size == 0) throw new Exception("Queue is empty");

        T item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size--;
        return item;
    }

    @Override
    public T head() {
        return this.array[this.front];
    }

    @Override
    public T tail() {
        return this.array[this.rear];
    }
}
