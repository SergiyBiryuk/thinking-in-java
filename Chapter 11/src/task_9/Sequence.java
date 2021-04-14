package task_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Sequence {

    private final List<Object> items;

    public Sequence() { items = new ArrayList<Object>(); }

    public void add(Object x) { items.add(x); }

    public Iterator<Object> iterator() { return items.iterator(); }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 100; i++)
            sequence.add(i);
        Iterator<Object> iterator = sequence.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}
