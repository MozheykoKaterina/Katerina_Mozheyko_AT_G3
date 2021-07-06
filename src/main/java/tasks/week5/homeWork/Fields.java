package main.java.tasks.week5.homeWork;

import main.java.tasks.week4.classWork.object.C;

import java.util.Objects;

public class Fields {

    public class Bubble {

        private int volume;
        private String name;

        public Bubble(int volume, String name) {
            this.volume = volume;
            this.name = name;
        }
        public String toString() {
            return "Bubble{" +
                    "volume=" + volume + "\" + " +
                    ", name=" + name +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bubble bubble = (Bubble) o;
            return volume == bubble.volume && name == bubble.name && Objects.equals(volume, name);
        }
        @Override
        public int hashCode() {
            return Objects.hash(volume, name);
        }

        public int getVolume() {
            return volume;
        }
        public void setVolume(int volume) {
            this.volume = volume;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public class Person {
        private int age;
        private String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String toString() {
            return "Person{" +
                    "age=" + age + "\" + " +
                    ", name=" + name +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && name == person.name && Objects.equals(age, name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


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

    public class Chair {

        int height;
        int width;

        public Chair(int height, int width) {
            this.height = height;
            this.width = width;
        }

        public String toString() {
            return "Chair{" +
                    "height=" + height + "\" + " +
                    ", width=" + width +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Chair chair = (Chair) o;
            return height == chair.height && width == chair.width && Objects.equals(height, width);
        }

        @Override
        public int hashCode() {
            return Objects.hash(height, width);
        }
    }
}