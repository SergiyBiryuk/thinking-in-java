package task_15.mypets;

public class Hamster extends Rodent {
    public Hamster(String name) { super(name); }
    public Hamster() {}
    public static class Factory implements typeinfo.factory.Factory<Hamster> {
        @Override public Hamster create() { return new Hamster(); }
    }
}
