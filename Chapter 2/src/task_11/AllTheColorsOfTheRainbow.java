package task_11;

public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow obj = new AllTheColorsOfTheRainbow();
        obj.changeTheHueOfTheColor(125);
        System.out.println(obj.anIntegerRepresentingColors);
    }
}
