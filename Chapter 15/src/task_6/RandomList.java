package task_6;

import typeinfo.pets.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private static Random rand = new Random();
    public void add(T item) { storage.add(item); }
    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }
    public static void main(String[] args) {
        RandomList<Pet> rs = new RandomList<Pet>();
        for(int i = 0; i < rand.nextInt(50) + 1; i++)
            rs.add(Pets.randomPet());
        for(int i = 0; i < 50; i++)
            System.out.print(rs.select() + " ");
    }
}
