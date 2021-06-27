package main.java.tasks.day7.object;

public class GenericContainerRunner<T> {

    public static void main(String[] args) {

        GenericContainer<Boolean> container= new GenericContainer<>();

        for (int i = 0; i < 10; i++) {
            //container.add(i);
            //container.add("bugaga");
            container.add(true);
            container.add(false);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(container.removeLast() + " ");
        }

        System.out.println();

        container.isEmpty();
    }
}
