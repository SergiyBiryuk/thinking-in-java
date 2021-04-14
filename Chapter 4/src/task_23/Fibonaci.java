package task_23;

public class Fibonaci {
    public static void print(int n) {
        switch (n < 1 ? 0 : n) {
            case 0:
                System.out.println("No");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("1 1 ");
                break;
            default:
                System.out.print("1 1 ");
                int a = 1, b = 1, c;
                for(int i = 3; i <= n; i ++) {
                    c = a + b;
                    a = b; b = c;
                    System.out.print(c + " ");
                }
                System.out.println();
        }
    }
    public static void main(String[] args) {
        print(-5);
        print(0);
        print(1);
        print(2);
        print(3);
        print(20);
    }
}
