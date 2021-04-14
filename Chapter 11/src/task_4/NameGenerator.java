package task_4;

import java.util.*;

public class NameGenerator {

    private static int i = 0;
    private final String[] names = { "Аладдин", "Джинн", "Кот", "Пёс", "Султан", "Яго", "Джафар", "Жасмин", "Абу", "Казим" };
    public String next() {
        String name = names[i++];
        if(i == names.length) i = 0;
        return name;
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>(),
                linkedList = new LinkedList<String>();
        Set<String> hashSet = new HashSet<String>(),
                linkedHashSet = new LinkedHashSet<String>(),
                treeSet = new TreeSet<String>();

        NameGenerator generator = new NameGenerator();
        for(int i = 0; i < 20; i++)
            arrayList.add(generator.next());
        for(int i = 0; i < 20; i++)
            linkedList.add(generator.next());
        for(int i = 0; i < 20; i++)
            hashSet.add(generator.next());
        for(int i = 0; i < 20; i++)
            linkedHashSet.add(generator.next());
        for(int i = 0; i < 20; i++)
            treeSet.add(generator.next());

        System.out.println(arrayList + "\n");
        System.out.println(linkedList + "\n");
        System.out.println(hashSet + "\n");
        System.out.println(linkedHashSet + "\n");
        System.out.println(treeSet + "\n");
    }
}

