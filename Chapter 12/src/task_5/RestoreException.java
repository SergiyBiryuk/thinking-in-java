package task_5;

public class RestoreException {
    public static void main(String[] args) {
        int number = 0;
        while (true) {
            try {
                System.out.println("Try block");
                if (number < 10)
                    throw new Exception("Too low number: " + number);
                else
                    break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                number++;
            } finally {
                System.out.println("Finally block");
            }
        }
        System.out.println("Main block");
        System.out.println("Good number: " + number);
    }
}
