package task_9;

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT
}

abstract class Instrument {
    private int value;
    public abstract void play(Note n);
    @Override public String toString() { return "Instrument"; }
    public abstract void adjust();
}

class Wind extends Instrument {
    @Override public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    @Override public String toString() { return "Wind"; }
    @Override public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion extends Instrument {
    @Override public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }
    @Override public String toString() { return "Percussion"; }
    @Override public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed extends Instrument {
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
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind()
        };
        tuneAll(orchestra);
    }
}
