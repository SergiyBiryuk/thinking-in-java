package task_15.mypets;

public class Mutt extends Dog {
    public Mutt(String name) { super(name); }
    public Mutt() {}
    public static class Factory implements typeinfo.factory.Factory<Mutt> {
        @Override public Mutt create() { return new Mutt(); }
    }
}
