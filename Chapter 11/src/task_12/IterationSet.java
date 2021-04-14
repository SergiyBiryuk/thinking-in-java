package task_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class IterationSet {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)),
                l2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ListIterator<Integer> it1 = l1.listIterator(),
                it2 = l2.listIterator(l2.size());
        System.out.println(l1);
        System.out.println("" + l2 + '\n');
        while(it1.hasNext()) {
            it2.previous();
            it2.set(it1.next());
        }
        System.out.println(l1);
        System.out.println(l2);
    }
}
