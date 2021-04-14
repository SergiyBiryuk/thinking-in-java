package task_16;

import java.util.Random;

public class Rand_25 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100000);
        for(int i = 0; i < 25; i++){
            int r = rand.nextInt(100000);
            if(r > n)
                System.out.println(r + " more than " + n);
            else if(r < n)
                System.out.println(r + " less than " + n);
            else
                System.out.println(r + " equally " + n);
            System.out.println();
        }
    }
}
