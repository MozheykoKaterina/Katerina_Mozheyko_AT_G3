package main.java.tasks.day7.object;

public class ObjectContainerRunner<T> {

    public static void main(String[] args) {
        ObjectContainer container = new ObjectContainer();

        for (int i = 0; i < 10; i++) {
            container.add(i);
            container.add("bugaga");
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(container.removeLast() + " ");
        }

        System.out.println();

        container.isEmpty();
    }
}