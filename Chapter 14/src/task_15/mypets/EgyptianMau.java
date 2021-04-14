package task_15.mypets;

public class EgyptianMau extends Cat {
    public EgyptianMau(String name) { super(name); }
    public EgyptianMau() {}
    public static class Factory implements typeinfo.factory.Factory<EgyptianMau> {
        @Override public EgyptianMau create() { return new EgyptianMau(); }
    }
}
