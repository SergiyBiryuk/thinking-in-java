package task_2;

interface Selector {
    boolean end();
    Object current();
    void next();
}

class StringContain {
    private final String str;
    public StringContain(String str) { this.str = str; }
    @Override public String toString() { return str; }
}

class Sequence {

    private StringContain[] sc = new StringContain[3]; {
        for(int i = 0; i < 3; i++) sc[i] = new StringContain("Number " + i);
    }
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length)
            items[next++] = x;
    }

    private class StringContainSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == sc.length; }
        public StringContain current() { return sc[i]; }
        public void next() { if(i < sc.length) i++; }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
    }

    public Selector selector() {
        // return new SequenceSelector();
        return new StringContainSelector();
    }
}

public class Main {
    public static void main(String[] args) {
        Selector s = new Sequence(10).selector();
        while(!s.end()) {
            System.out.println(s.current());
            s.next();
        }
    }
}
