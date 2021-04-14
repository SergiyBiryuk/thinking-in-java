package task_20;

public class IfElse {
    static boolean test(int testival, int begin, int end) {
        if((end > testival && testival > begin) || (end < testival && testival < begin)) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(test(5, 10, 20));
        System.out.println(test(5, 0 , 10));
        System.out.println(test(5, 10 , 1));
    }
}
