package task_18;

public class Primes {
    public static void main(String[] args) {
        for(int i = 2;; i++) {
            boolean f = true;
            for (int j = 2; j < i / 2 + 1; j++)
                if(i % j == 0) {
                    f = false;
                    break;
                }
            if(f == true) System.out.println(i);
        }
    }
}
