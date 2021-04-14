package task_15.mypets;

public class Dog extends Pet {
    public Dog(String name) { super(name); }
    public Dog() {}
    public static class Factory implements typeinfo.factory.Factory<Dog> {
        @Override public Dog create() { return new Dog(); }
    }
}
