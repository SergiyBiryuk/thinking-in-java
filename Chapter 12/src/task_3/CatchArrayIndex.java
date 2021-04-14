package task_3;

public class CatchArrayIndex {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            for (int i = 0; ; i++)
                array[i] = i;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
