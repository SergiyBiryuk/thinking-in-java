package task_13;

public class Test {
    static void printBinaryChar(char c) {
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c) + '\n');
    }

    public static void main(String[] args) {
        Test.printBinaryChar('\u1234');
        Test.printBinaryChar('\u5433');
        Test.printBinaryChar('\u9999');
        Test.printBinaryChar('D');
        Test.printBinaryChar('3');
    }
}
