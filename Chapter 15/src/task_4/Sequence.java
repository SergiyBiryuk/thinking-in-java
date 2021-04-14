package task_4;

import java.util.ArrayList;

interface Selector {
        boolean end();
        Object current();
        void next();
}

public class Sequence<T> {
    private ArrayList<T> al;
    public Sequence() { al = new ArrayList<T>(); }
    public void add(T x) { al.add(x); }
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == al.size(); }
        public Object current() { return al.get(i); }
        public void next() { if(i < al.size()) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence<Number> sequence = new Sequence<Number>();
        for(int i = 0; i < 10; i++)
            sequence.add(i);
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}
