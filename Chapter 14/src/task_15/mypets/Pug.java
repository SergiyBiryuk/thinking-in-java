package task_15.mypets;

public class Pug extends Dog {
    public Pug(String name) { super(name); }
    public Pug() {}
    public static class Factory implements typeinfo.factory.Factory<Pug> {
        @Override public Pug create() { return new Pug(); }
    }
}
