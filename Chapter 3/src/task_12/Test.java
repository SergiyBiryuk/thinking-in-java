package task_12;

public class Test {
    public static void main(String[] args) {
        int i = 0xFFFFFFFF;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i) + "\n");
        i <<= 1;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i) + "\n");
        for (int q = 0; q < 32; q++) {
            i >>>= 1;
            System.out.println(i);
            System.out.println(Integer.toBinaryString(i) + "\n");
        }
    }
}
