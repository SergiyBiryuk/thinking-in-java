package task_15.mypets;

public class Gerbil extends Rodent {
    public Gerbil(String name) { super(name); }
    public Gerbil() {}
    public static class Factory implements typeinfo.factory.Factory<Gerbil> {
        @Override public Gerbil create() { return new Gerbil(); }
    }
}