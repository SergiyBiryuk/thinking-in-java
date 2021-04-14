package task_7;

import java.util.*;

public class IterableFibonacci implements Iterable<Integer> {
    private int n;
    private final Fibonacci f = new Fibonacci();
    public IterableFibonacci(int count) { n = count; }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() { return n > 0; }
            public Integer next() {
                n--;
                return f.next();
            }
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        for(int i : new IterableFibonacci(18))
            System.out.print(i + " ");
    }
}
