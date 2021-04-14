package task_1;

public class ThrowException {
    public static void main(String[] args) {
        try {
            throw new Exception("Throwing Excetion from main()");
        } catch(Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}
