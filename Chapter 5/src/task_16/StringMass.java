package task_16;

import java.util.Random;

public class StringMass {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] stringArray = new String[10];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = String.valueOf(rand.nextInt(1000));
        }
        for (String s : stringArray) {
            System.out.print(s + ' ');
        }
    }
}
