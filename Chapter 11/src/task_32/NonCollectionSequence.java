package task_32;

import typeinfo.pets.*;
import java.util.*;

class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while(it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + " " + p + " ");
        }
        System.out.println();
    }
    public static void display(Collection<Pet> pets) {
        for(Pet p : pets)
            System.out.print(p.id() + " " + p + " ");
        System.out.println();
    }
}

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index;
            @Override public boolean hasNext() { return index < pets.length; }
            @Override public Pet next() { return pets[index++]; }
            @Override public void remove() { throw new UnsupportedOperationException(); }
        };
    }
    public static void main(String[] args) {
        MultiNonCollectionSequence mnc = new MultiNonCollectionSequence();
        for(Pet p : mnc)
            System.out.print(p + " ");
        System.out.println();
        for(Pet p : mnc.reversed())
            System.out.print(p + " ");
        System.out.println();
        for(Pet p : mnc.randomized())
            System.out.print(p + " ");
        System.out.println();
    }
}

class MultiNonCollectionSequence extends NonCollectionSequence {
    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int index = pets.length;
                    @Override public boolean hasNext() { return index > 0; }
                    @Override public Pet next() { return pets[--index]; }
                    @Override public void remove() { throw new UnsupportedOperationException(); }
                };
            }
        };
    }
    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }
}
