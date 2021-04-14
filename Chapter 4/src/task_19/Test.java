package task_19;

public class Test {
    static final int a = 0b10101010101010101010101010101010;
    final static int b = 0b01010101010101010101010101010101;
    public static void printBin(int i) {
        String s = i == 0 ? "0" : "";
        while(i != 0) {
            s = (i % 2 == 0 ? "0" : "1") + s;
            i >>>= 1;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        printBin(a);
        printBin(b);
        printBin(a & b);
        printBin(a | b);
        printBin(a ^ b);
        printBin(~a);
        printBin(~b);
    }
}
