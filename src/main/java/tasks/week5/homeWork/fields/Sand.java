package main.java.tasks.week5.homeWork.fields;

import java.util.Objects;

public class Sand {

    int weight;
    String name;

    public Sand(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public String toString() {
        return "Sand{" +
                "weight=" + weight + "\" + " +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sand sand = (Sand) o;
        return weight == sand.weight && name == sand.name && Objects.equals(weight, name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
