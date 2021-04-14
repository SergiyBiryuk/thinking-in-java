package task_26;

import java.util.*;
import task_25.WordPositions;

public class RestoreWordOrder {
    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> map = new TreeMap<String, ArrayList<Integer>>();
        WordPositions.main(map);

        Map<Integer, String> text = new TreeMap<Integer, String>();

        Set<String> keySet = map.keySet();
        for(Iterator<String> keyIt = keySet.iterator(); keyIt.hasNext();) {
            String key = keyIt.next();
            List<Integer> value = map.get(key);
            for(Iterator<Integer> valueIt = value.iterator(); valueIt.hasNext();) {
                int position = valueIt.next();
                text.put(position, key);
            }
        }

        System.out.println(text.values());
    }
}
