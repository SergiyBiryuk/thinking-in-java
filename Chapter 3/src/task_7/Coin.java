package task_7;

import java.util.Random;

public class Coin {
    static void flip() {
        Random rand = new Random();
        int result = rand.nextInt(2);
        if (result == 0)
            System.out.println(result + " : решка");
        else
            System.out.println(result + " : орёл");
    }
    public static void main(String[] args) {
        flip();
        flip();
        flip();
        flip();
        flip();
        flip();
        flip();
    }
}
