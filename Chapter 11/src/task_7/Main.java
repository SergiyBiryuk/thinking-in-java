package task_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MyClass {
    private static int count;
    private final int id = count++;
    public final int id() { return id; }
    @Override public String toString() { return "ID = " + id; }
}

public class Main {
    public static void main(String[] args) {
        MyClass[] mc = { new MyClass(), new MyClass(), new MyClass(), new MyClass(), new MyClass() };
        List<MyClass> l = new ArrayList<MyClass>();
        Collections.addAll(l, mc);
        System.out.println("Main List: " + l);
        List<MyClass> sub = new ArrayList<MyClass>(l.subList(2, 4));
        System.out.println("Sub List: " + sub);
        l.removeAll(sub);
        System.out.println("Main List: " + l);
        System.out.println("Sub List: " + sub);
    }
}
