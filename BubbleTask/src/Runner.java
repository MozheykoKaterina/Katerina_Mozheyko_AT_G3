public class Runner {

    public static void main(String[] args) {

        Bootle bootle = new Bootle(0.5, 0.5);
        Bootle bootle2 = new Bootle(1, 1);
        Bootle bootle3 = new Bootle(1.5, 1.5);

        Bootle open = new Bootle();
        bootle.open();
        bootle2.open();
        bootle3.open();

        Bootle bootle4 = new Bootle(1.5, 1.5, 5);
        Bootle bootle5 = new Bootle(1.5, 1.5, 22);

        bootle4.openTemp();
        bootle5.openTemp();

    }

}
