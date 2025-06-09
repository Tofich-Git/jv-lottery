package core.basesyntax;

public class Ball {
    final Color color;
    final int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return "Ball{color=" + color + ", number=" + number + "}";
    }

}
