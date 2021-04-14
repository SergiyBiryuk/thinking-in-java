package task_28;

import java.util.*;

public class DoublePriorityQueue {
    public static void main(String[] args) {
        Random rand = new Random();
        PriorityQueue<Double> pq = new PriorityQueue<Double>();
        for(int i = 0; i < rand.nextInt(100); i++)
            pq.offer(rand.nextDouble());
        System.out.println(pq);
        while(pq.peek() != null)
            System.out.print(pq.poll() + " ");
        System.out.println();
    }
}
