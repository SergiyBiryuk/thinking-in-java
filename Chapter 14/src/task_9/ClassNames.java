package task_9;

import java.util.LinkedHashMap;
import java.util.Arrays;

public class ClassNames {
    private static StringBuilder str;
    public static void printClassNames(Object o) {
        str = new StringBuilder();
        str.append('\n');
        action(o.getClass());
        System.out.println(str);
    }
    private static void action(Class c) {
        if(c == null)
            return;
        str.append(c.getName());
        str.append('\n');
        str.append(Arrays.asList(c.getDeclaredFields()).toString().replace(',', '\n'));
        str.append("\n\n");
        action(c.getSuperclass());
    }
    public static void main(String[] args) {
        printClassNames("qwe");
        printClassNames(1L);
        printClassNames(new LinkedHashMap());
        printClassNames(new ClassNotFoundException());
    }
}
