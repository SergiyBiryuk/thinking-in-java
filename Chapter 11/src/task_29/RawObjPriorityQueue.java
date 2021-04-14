package task_29;

import java.util.*;

class My {}
// trows ClassCastException
public class RawObjPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<My> queue = new PriorityQueue<My>();
        for(int i = 0; i < 5; i++)
            queue.offer(new My());
    }
}


