public class Bootle {

    private double volumeBottle;
    private SparklingWater water;
    //Bubble[] bubbles;


    public Bootle(double volumeBottle) {
        this.volumeBottle = volumeBottle;
        System.out.println(volumeBottle + " liter bottle created!");
        Bubble[] bubbles = new Bubble[(int) (volumeBottle * 10000)];
        SparklingWater water = new SparklingWater();
        water.pump(bubbles);

        }


    public void open() {
        this.volumeBottle = volumeBottle;
        System.out.println(volumeBottle + " liter bottle opened!");
        Bubble[] bubbles = new Bubble[(int) (volumeBottle * 10000)];
        SparklingWater water = new SparklingWater();
        water.degas(bubbles);
    }


    public double getVolumeBottle() {
        return volumeBottle;
    }

    public void setVolumeBottle(double volumeBottle) {
        this.volumeBottle = volumeBottle;
    }

}

