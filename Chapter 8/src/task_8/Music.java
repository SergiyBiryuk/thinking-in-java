package task_8;

import java.util.Random;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT
}

class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }
}

class Wind extends Instrument {
    @Override void play(Note n) { System.out.println("Wind.play() " + n); }
    @Override public String toString() { return "Wind"; }
    @Override void adjust() { System.out.println("Adjusting Wind"); }
}

class Percussion extends Instrument {
    @Override void play(Note n) { System.out.println("Percussion.play() " + n); }
    @Override public String toString() { return "Percussion"; }
    @Override void adjust() { System.out.println("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    @Override void play(Note n) { System.out.println("Stringed.play() " + n); }
    @Override public String toString() { return "Stringed"; }
    @Override void adjust() { System.out.println("Adjusting Stringed"); }
}

class Keyboards extends Instrument {
    @Override void play(Note n) { System.out.println("Keyboards.play() " + n); }
    @Override public String toString() { return "Keyboards"; }
    @Override void adjust() { System.out.println("Adjusting Keyboards"); }
}

class Brass extends Wind {
    @Override void play(Note n) { System.out.println("Brass.play() " + n); }
    @Override void adjust() { System.out.println("Adjusting Brass"); }
}

class WoodWind extends Wind {
    @Override void play(Note n) { System.out.println("WoodWind.play() " + n); }
    @Override public String toString() { return "WoodWind"; }
}

class InstrumentGenerator {
    private static Random rand = new Random();
    public static Instrument next() {
        switch (rand.nextInt(7)) {
            default:
            case 0: return new Instrument();
            case 1: return new Wind();
            case 2: return new Percussion();
            case 3: return new Stringed();
            case 4: return new Keyboards();
            case 5: return new Brass();
            case 6: return new WoodWind();
        }
    }
}

public class Music {
    public static void tune(Instrument i) {
        // ...tuning
        i.play(Note.MIDDLE_C);
        System.out.println(i);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e) { tune(i); }
    }
    public static void main(String[] args) {

        Instrument[] orchestra = new Instrument[10];
        for(int i = 0; i < orchestra.length; i++)
            orchestra[i] = InstrumentGenerator.next();
        tuneAll(orchestra);
    }
}
