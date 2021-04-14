package task_7;

import java.util.Random;

interface Rodent {
    void eat();
    void sleep();
    void run();
}

class Mouse implements Rodent {
    @Override public void eat() { System.out.println("Mouse.eat()"); }
    @Override public void sleep() { System.out.println("Mouse.sleep()"); }
    @Override public void run() { System.out.println("Mouse.run()"); }
}

class Hamster implements Rodent {
    @Override public void eat() { System.out.println("Hamster.eat()"); }
    @Override public void sleep() { System.out.println("Hamster.sleep()"); }
    @Override public void run() { System.out.println("Hamster.run()"); }
}

class RodentGen {
    private static final byte BOUND = 2;
    private static Random rand = new Random();
    public static Rodent next() {
        switch(rand.nextInt(BOUND)) {
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Rodent[] r = new Rodent[10];
        for(int i = 0; i < r.length; i++)
            r[i] = RodentGen.next();
        for(Rodent i : r) {
            i.eat(); i.run(); i.sleep();
            System.out.println();
        }
    }
}
