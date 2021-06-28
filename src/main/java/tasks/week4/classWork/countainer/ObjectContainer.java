package main.java.tasks.week4.classWork.countainer;

public class ObjectContainer {

    private Object[] container;
    private int counter;

    public ObjectContainer() {
        container = new Object[10];
        counter = 0;
    }

    public void add(Object o) {
        if (counter < container.length) {
            container[counter++] = o;
        }
    }

    public Object removeLast() {
        Object a = null;
        if (counter > 0) {
            a = container[counter - 1];
            container[--counter] = null;
        }
        return a;
    }

    boolean isEmpty() {
        System.out.println();
        return counter == 0;
    }

}




