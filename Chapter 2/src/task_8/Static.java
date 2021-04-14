package task_8;

public class Static {
    static int i = 5;

    public static void main(String[] args) {
        Static s1 = new Static(),
               s2 = new Static();
        System.out.println(s1.i);
        System.out.println(s2.i);
        s2.i++;
        System.out.println(s1.i);
        System.out.println(s2.i);
    }
}
