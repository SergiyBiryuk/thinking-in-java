package task_15.mypets;

public class Mouse extends Rodent {
    public Mouse(String name) { super(name); }
    public Mouse() {}
    public static class Factory implements typeinfo.factory.Factory<Mouse> {
        @Override public Mouse create() { return new Mouse(); }
    }
}
