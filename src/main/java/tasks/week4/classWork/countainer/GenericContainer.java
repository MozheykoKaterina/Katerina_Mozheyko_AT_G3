package main.java.tasks.week4.classWork.countainer;

public class GenericContainer<T> {

    private T[] container;
    private int counter = 0;

    public GenericContainer() {
        container = (T[]) new Object[10];
        counter = 0;
    }

    public void add(T o) {
        if (counter < container.length) {
            container[counter++] = o;
        }
    }

    public T removeLast() {
        T a = null;
        if (counter > 0) {
            a = container[counter - 1];
            container[--counter] = null;
        }
        return a;
    }

    public boolean isEmpty() {
        return counter == 0;
    }
}
