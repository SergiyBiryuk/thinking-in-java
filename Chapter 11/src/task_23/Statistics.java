package task_23;

import java.util.*;

public class Statistics {
    public static int count() {
        Random rand = new Random();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        int maxID = 0;
        for(int i = 1; i < 20; i++)
            if(m.get(maxID) < m.get(i))
                maxID = i;
        return maxID;
    }


    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < 20; i++)
            m.put(i, 0);
        for(int i = 0; i < 100; i++) {
            int maxID = count();
            m.put(maxID, m.get(maxID) + 1);
        }
        System.out.println(m);
    }
}
