package task_10;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT
}

interface Playable {
    void play(Note n);
}

interface Instrument {
    int VALUE = 5;
    void adjust();
}

class Wind implements Instrument, Playable {
    @Override public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    @Override public String toString() { return "Wind"; }
    @Override public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion implements Instrument, Playable {
    @Override public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    @Override public String toString() { return "Percussion"; }
    @Override public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed implements Instrument, Playable {
    @Override public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    @Override public String toString() { return "Stringed"; }
    @Override public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass extends Wind {
    @Override public String toString() { return "Brass"; }
}

class WoodWind extends Wind {
    @Override public String toString() { return "WoodWind"; }
}

public class Music {
    static void tune(Playable i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind()
        };
        tuneAll(orchestra);
    }
}
