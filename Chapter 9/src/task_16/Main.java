package task_16;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class CharSequenceGenerator {
    private Random rand = new Random();
    private char[] ex = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public char[] generate() {
        char[] secuence = new char[rand.nextInt(20) + 1];
        for(int i = 0; i < secuence.length; i++)
            secuence[i] = ex[rand.nextInt(ex.length)];
        return secuence;
    }
}

class Adapter extends CharSequenceGenerator implements Readable {
    private int count;
    public Adapter(int count) { this.count = count; }
    @Override public int read(CharBuffer cb) {
        if(count-- == 0) return -1; // must be! means end of input
        String sequence = String.valueOf(generate()) + "\r";
        cb.append(sequence);
        return sequence.length(); // number of added chars
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new Adapter(10));
        while(sc.hasNext())
            System.out.println(sc.next());
    }
}
