package task_22;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }
    private abstract class SequenceSelector implements Selector {
        private int i;
        private SequenceSelector(final int i) { this.i = i; }
        @Override public Object current() { return items[i]; }
    }
    public Selector forwardSelector() {
        return new SequenceSelector(0) {
            @Override public boolean end() { return super.i == items.length; }
            @Override public void next() { if(super.i < items.length) super.i++; }
        };
    }
    public Selector reverseSelector() {
        return new SequenceSelector(items.length - 1) {
            @Override public boolean end() { return super.i == 0; }
            @Override public void next() { if(super.i > 0) super.i--; }
        };
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        System.out.println("FORWARD SELECTOR");
        Selector selector = sequence.forwardSelector();
        while(!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
        System.out.println("REVERSE SELECTOR");
        selector = sequence.reverseSelector();
        while(!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
