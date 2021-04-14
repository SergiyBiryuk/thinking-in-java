package task_22;

import java.util.Random;

public class SwitchTest {
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i < 100; i++) {
            System.out.print(i + ": ");
            switch (rand.nextInt(7)) {
                case 0:
                    System.out.println(0);
                    break;
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                default:
                    System.out.println("Another");
            }
        }
    }
}
