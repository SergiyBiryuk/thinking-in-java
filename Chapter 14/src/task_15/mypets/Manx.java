package task_15.mypets;

public class Manx extends Cat {
    public Manx(String name) { super(name); }
    public Manx() {}
    public static class Factory implements typeinfo.factory.Factory<Manx> {
        @Override public Manx create() { return new Manx(); }
    }
}
