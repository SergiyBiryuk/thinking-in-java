package task_30;

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

public class CollectionSequence implements Collection<Pet> {

    private Pet[] pets = Pets.createArray(8);

    @Override public boolean add(Pet p) {
        throw new UnsupportedOperationException();
    }
    @Override public boolean addAll(Collection<? extends Pet> c) {
        throw new UnsupportedOperationException();
    }
    @Override public void clear() {
        for(Pet p : pets) p = null;
    }
    @Override public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }
    @Override public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
    @Override public boolean isEmpty() {
        return this.size() == 0;
    }
    @Override public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index;
            @Override public boolean hasNext() {
                return index < pets.length;
            }
            @Override public Pet next() {
                return pets[index++];
            }
            @Override public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    @Override public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }
    @Override public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
    @Override public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }
    @Override public int size() {
        return pets.length;
    }
    @Override public Object[] toArray() {
        return pets;
    }
    @Override public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
