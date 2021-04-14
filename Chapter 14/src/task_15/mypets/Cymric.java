package task_15.mypets;

public class Cymric extends Manx {
    public Cymric(String name) { super(name); }
    public Cymric() {}
    public static class Factory implements typeinfo.factory.Factory<Cymric> {
        @Override public Cymric create() { return new Cymric(); }
    }
}
