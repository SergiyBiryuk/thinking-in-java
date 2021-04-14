package task_3;

import java.util.List;
import java.util.ArrayList;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {

    private List<Object> items;

    public Sequence() { items = new ArrayList<Object>(); }

    public void add(Object x) { items.add(x); }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override public boolean end() { return i == items.size(); }
        @Override public Object current() { return items.get(i); }
        @Override public void next() { if(i < items.size()) i++; }
    }

    public Selector selector() { return new SequenceSelector(); }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 100; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
