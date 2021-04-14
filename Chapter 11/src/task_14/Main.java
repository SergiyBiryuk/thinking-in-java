package task_14;

import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < 23; i++)
            list.listIterator(list.size() / 2).add(i);
        System.out.println(list);
    }
}
