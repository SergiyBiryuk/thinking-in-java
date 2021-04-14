package task_10;

public class Test {
    static final int a = 0b10101010101010101010101010101010;
    final static int b = 0b01010101010101010101010101010101;
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(a & b));
        System.out.println(Integer.toBinaryString(a | b));
        System.out.println(Integer.toBinaryString(a ^ b));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(~b));
    }
}
