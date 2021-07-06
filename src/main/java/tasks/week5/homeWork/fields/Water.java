package main.java.tasks.week5.homeWork.fields;

import java.util.Objects;

public class Water {

    private String color;
    private String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String toString() {
        return "Water{" +
                "color=" + color + "\" + " +
                ", smell=" + smell +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Water water = (Water) o;
        return color == water.color && smell == water.smell && Objects.equals(color, smell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, smell);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }
}
