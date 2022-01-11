package adt.list;

public class DynamicList<T> implements IList<T> {

    private int capacity;
    private int size;
    private T[] array;

    public DynamicList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T item) {
        if (size + 1 >= capacity) {
            resize();
        }
        array[size++] = item;
    }

    @Override
    public void add(T item, int index) {
        if (index < 0) throw new ArrayIndexOutOfBoundsException();

        if (size + 1 >= capacity) {
            resize();
        }

        for (int i = size - 1; i >= index; --i) {
            array[i + 1] = array[i];
            if (i == index) {
                array[i] = item;
                size++;
            }
        }
    }

    /**
     * Resizes the array by twice the current capacity each time it resizes
     */
    private void resize() {
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];

        for (int i = 0; i < size; ++i) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    @Override
    public boolean contains(T item) {
        boolean contains = false;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index > capacity - 1) throw new ArrayIndexOutOfBoundsException();

        T toRemove = array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return toRemove;
    }
}
