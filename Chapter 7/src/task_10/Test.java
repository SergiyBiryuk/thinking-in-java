package task_10;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random(100);
        System.out.println("COMPONENTS");
        int i = r.nextInt(100);
        new Component1(i);
        new Component2(i);
        new Component3(i);
        System.out.println("ROOT");
        new Root(r.nextInt(100));
        System.out.println("STEM");
        new Stem(r.nextInt(100));
    }
}
