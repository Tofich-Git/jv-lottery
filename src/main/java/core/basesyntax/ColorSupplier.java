package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }

    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
    }
}


