package task_18;

import java.util.Random;

public class Test {
    static Random rand = new Random();
    final static int a = rand.nextInt(100);
    final int b = rand.nextInt(100);

    public static void main(String[] args) {
        System.out.println(Test.a);
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1.a);
        System.out.println(t2.a);
        System.out.println(t1.b);
        System.out.println(t2.b);
    }
}
