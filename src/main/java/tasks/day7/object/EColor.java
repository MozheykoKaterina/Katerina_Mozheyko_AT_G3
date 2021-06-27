package main.java.tasks.day7.object;

public enum EColor {

    RED("red", 1),
    BLUE("blue", 2),
    GREEN("green", 3),
    YELLOW("yellow", 4),
    PURPLE("purple", 5);

    String color;
    int hex;

    EColor(String color, int hex) {
        this.color = color;
        this.hex = hex;
    }

    public static EColor byHex(int hex) {
        switch (hex) {
            case 1: return RED;
            case 2: return BLUE;
            case 3: return GREEN;
            default: return YELLOW;
        }
    }
}
