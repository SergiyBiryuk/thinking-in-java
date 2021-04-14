package task_15.mypets;

public class Rat extends Rodent {
    public Rat(String name) { super(name); }
    public Rat() {}
    public static class Factory implements typeinfo.factory.Factory<Rat> {
        @Override public Rat create() { return new Rat(); }
    }
}
