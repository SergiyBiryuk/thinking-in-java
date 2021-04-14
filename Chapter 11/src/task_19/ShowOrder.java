package task_19;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class ShowOrder {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 20; i >= 0; i--)
            set.add(i);
        System.out.println(set + "\n");

        Integer[] keyArray = set.toArray(new Integer[0]);
        for (int i = 0; i < keyArray.length - 1; i++) {
            for (int j = 0; j < keyArray.length - (i+1); j++) {
                if (keyArray[j] < keyArray[j+1]) {
                    Integer q = keyArray[j]; keyArray[j] = keyArray[j + 1]; keyArray[j + 1] = q;
                }
            }
        }

        set = new LinkedHashSet<Integer>();
        for(Integer i : keyArray)
            set.add(i);
        System.out.println(set + "\n");
    }
}
