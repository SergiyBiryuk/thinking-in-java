package task_15.mypets;

public class Cat extends Pet {
    public Cat(String name) { super(name); }
    public Cat() {}
    public static class Factory implements typeinfo.factory.Factory<Cat> {
        @Override public Cat create() { return new Cat(); }
    }
}
