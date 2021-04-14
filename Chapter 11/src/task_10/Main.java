package task_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class Rodent {
    public void eat() { System.out.println("Rodent.eat()"); }
    public void sleep() { System.out.println("Rodent.sleep()"); }
    public void run() { System.out.println("Rodent.run()"); }
}

class Mouse extends Rodent {
    @Override public void eat() { System.out.println("Mouse.eat()"); }
    @Override public void sleep() { System.out.println("Mouse.sleep()"); }
    @Override public void run() { System.out.println("Mouse.run()"); }
}

class Hamster extends Rodent {
    @Override public void eat() { System.out.println("Hamster.eat()"); }
    @Override public void sleep() { System.out.println("Hamster.sleep()"); }
    @Override public void run() { System.out.println("Hamster.run()"); }
}

class RodentGen {
    private static Random rand = new Random();
    public static Rodent next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Rodent();
            case 1: return new Mouse();
            case 2: return new Hamster();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Rodent> r = new ArrayList<Rodent>();
        for(int i = 0; i < 20; i++)
            r.add(RodentGen.next());
        for(Iterator<Rodent> it = r.iterator(); it.hasNext();) {
            Rodent x = it.next();
            x.eat(); x.run(); x.sleep();
        }
    }
}
