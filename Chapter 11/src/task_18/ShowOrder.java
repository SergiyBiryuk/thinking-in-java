package task_18;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import task_4.NameGenerator;

public class ShowOrder {
    public static void main(String[] args) {

        NameGenerator gen = new NameGenerator();

        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 20; i >= 0; i--)
            map.put(i, gen.next());
        System.out.println(map + "\n");

        Integer[] keyArray = map.keySet().toArray(new Integer[0]);
        String[] valArray = new String[keyArray.length];
        for (Integer i : keyArray)
            valArray[i] = map.get(i);

        for (int i = 0; i < keyArray.length - 1; i++) {
            for (int j = 0; j < keyArray.length - (i+1); j++) {
                if (keyArray[j] < keyArray[j+1]) {
                    Integer q = keyArray[j]; keyArray[j] = keyArray[j + 1]; keyArray[j + 1] = q;
                    String s = valArray[j]; valArray[j] = valArray[j + 1]; valArray[j + 1] = s;
                }
            }
        }

        map = new LinkedHashMap<Integer, String>();
        for(Integer i : keyArray)
            map.put(i, valArray[i]);
        System.out.println(map + "\n");
    }
}
