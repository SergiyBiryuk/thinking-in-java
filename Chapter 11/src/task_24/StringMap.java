package task_24;

import java.util.*;

class NameGenerator {
    private final Random rand = new Random();
    private final String[] names = {"Аладдин", "Джинн", "Кот", "Пёс", "Султан", "Яго", "Джафар", "Жасмин", "Абу", "Казим"};
    public String next() { return names[rand.nextInt(names.length)]; }
}

public class StringMap {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<String, String>();

        NameGenerator gen = new NameGenerator();
        for (int i = 0; i < 100; i++) {
            String value = gen.next();
            map.put(value, value);
        }
        System.out.println(map + "\n");

        Set<String> set = new TreeSet<String>(map.keySet());
        map.clear();

        for(Iterator<String> it = set.iterator(); it.hasNext();) {
            String value = it.next();
            map.put(value, value);
        }

        System.out.println(map);
    }
}
