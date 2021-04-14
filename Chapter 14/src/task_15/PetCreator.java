package task_15;

import task_15.mypets.*;
import java.util.*;
import typeinfo.factory.Factory;

public abstract class PetCreator {
    private Random rand = new Random(47);
    public abstract List<Class<? extends Factory<? extends Pet>>> types();
    public Pet randomPet() {
        int n = rand.nextInt(types().size());
        try {
            return types().get(n).newInstance().create();
        } catch(InstantiationException e) {
            throw new RuntimeException(e);
        } catch(IllegalAccessException e) {
            throw new RuntimeException();
        }
    }
    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for(int i = 0; i < size; i++)
            result[i] = randomPet();
        return result;
    }
    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<Pet>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}
