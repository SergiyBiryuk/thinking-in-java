package task_4;

interface Selector {
    boolean end();
    Object current();
    void next();
    Object getOuter();
}

class Sequence {

    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
        else System.out.println("Full!");
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override public boolean end() { return i == items.length; }
        @Override public Object current() { return items[i]; }
        @Override public void next() { if(i < items.length) i++; }
        @Override public Object getOuter() { return Sequence.this; }
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}

public class Main {
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(i);
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
        ((Sequence)selector.getOuter()).add(5);
    }
}
