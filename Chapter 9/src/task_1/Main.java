package task_1;

import java.util.Random;

abstract class Rodent {
    abstract public void eat();
    abstract public void sleep();
    abstract public void run();
    @Override public String toString() { return "Rodent"; }
}

class Mouse extends Rodent {
    @Override public void eat() { System.out.println("Mouse.eat()"); }
    @Override public void sleep() { System.out.println("Mouse.sleep()"); }
    @Override public void run() { System.out.println("Mouse.run()"); }
    @Override public String toString() { return "Mouse"; }
}

class Hamster extends Rodent {
    @Override public void eat() { System.out.println("Hamster.eat()"); }
    @Override public void sleep() { System.out.println("Hamster.sleep()"); }
    @Override public void run() { System.out.println("Hamster.run()"); }
    @Override public String toString() { return "Hamster"; }
}

class RodentGen {
    private static Random rand = new Random();
    public static Rodent next() {
        switch(rand.nextInt(2)) {
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
        for(Rodent i : r)
            System.out.println(i);
    }
}
