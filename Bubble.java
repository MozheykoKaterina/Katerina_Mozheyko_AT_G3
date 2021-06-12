public class Bubble {

    private double volume;
    private String structure;

    public Bubble() {
        this.volume = 0.3;
        this.structure = "empty";
    }

    public Bubble(double volume, String structure) {
        this.volume = volume;
        this.structure = structure;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

}
