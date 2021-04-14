package task_15.mypets;

public class Rodent extends Pet {
    public Rodent(String name) { super(name); }
    public Rodent() {}
    public static class Factory implements typeinfo.factory.Factory<Rodent> {
        @Override public Rodent create() { return new Rodent(); }
    }

}
