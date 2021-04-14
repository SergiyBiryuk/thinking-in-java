package task_1;

import typeinfo.pets.*;

public class Holder3<T> {
    private T a;
    public Holder3(T a) { this.a = a; }
    public void set(T a) { this.a = a; }
    public T get() { return a; }
    public static void main(String [] args) {
        Holder3<Pet> h3 = new Holder3<Pet>(Pets.randomPet());
        Pet p = h3.get();
        System.out.println("0 " + p);
        for(int i = 0; i < 10; i++) {
            h3.set(Pets.randomPet());
            System.out.println(i + 1 + " " + h3.get());
        }
    }
}
