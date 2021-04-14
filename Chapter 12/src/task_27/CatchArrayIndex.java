package task_27;

public class CatchArrayIndex {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            for (int i = 0; ; i++)
                array[i] = i;
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
    }
}
