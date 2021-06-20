package main.java.project.object;

public class Bubble {

        private double volume;
        private String structure;

        public Bubble() {
            this.volume = 03;
            this.structure = "gas";
        }

        public Bubble(String gas) {

        }

        public void cramp() {
            System.out.println("Cramp!");
        }

        public double getVolume() {
            return volume;
        }


    }

