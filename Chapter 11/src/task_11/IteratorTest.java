package task_11;

import java.util.*;

class Test implements Comparable<Test> {
    private static int counter;
    private final int id = counter++;
    @Override public int compareTo(Test t) { return id - t.id; }
    @Override public String toString() { return id + ""; }
}

public class IteratorTest {
    public static void method(Iterator<Test> it) {
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Object q = new Object();
        Collection<Test> cAL = new ArrayList<Test>();
        for (int i = 0; i < 10; i++) cAL.add(new Test());
        Collection<Test> cLL = new LinkedList<Test>(cAL);
        Collection<Test> cLHS = new LinkedHashSet<Test>(cAL);
        Collection<Test> cHS = new HashSet<Test>(cAL);
        Collection<Test> cTS = new TreeSet<Test>(cAL);
        method(cAL.iterator());
        method(cLL.iterator());
        method(cLHS.iterator());
        method(cHS.iterator());
        method(cTS.iterator());
    }
}
