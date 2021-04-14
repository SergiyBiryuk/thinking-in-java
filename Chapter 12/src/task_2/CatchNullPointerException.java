package task_2;

public class CatchNullPointerException {
    public static void printInt(Integer i) {
        System.out.println(i.toString());
    }
    public static void main(String[] args) {
        Integer i = null;
        try {
            printInt(i);
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
