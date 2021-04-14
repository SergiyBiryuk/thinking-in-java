package task_12;

import java.util.Random;

class Paw {
    public Paw() { System.out.println("Paw()"); }
}
class Nose {
    public Nose() { System.out.println("Nose()"); }
}
class Tail {
    public Tail() { System.out.println("Tail()"); }
}
class Cheeks {
    Cheeks() { System.out.println("Paw()"); }
}

class Rodent {

    protected Nose n = new Nose();
    protected Paw[] paws = new Paw[4];
    {
        for(int i = 0; i < paws.length; i++)
            paws[i] = new Paw();
    }

    public Rodent() { System.out.println("Rodent()"); }

    public void eat() { System.out.println("Rodent.eat()"); }
    public void sleep() { System.out.println("Rodent.sleep()"); }
    public void run() { System.out.println("Rodent.run()"); }
}
class Mouse extends Rodent {

    protected Tail t = new Tail();

    public Mouse() { System.out.println("Mouse()"); }

    @Override public void eat() { System.out.println("Mouse.eat()"); }
    @Override public void sleep() { System.out.println("Mouse.sleep()"); }
    @Override public void run() { System.out.println("Mouse.run()"); }
}
class Hamster extends Rodent {

    protected Cheeks c = new Cheeks();

    public Hamster() { System.out.println("Hamster()"); }

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
        Rodent[] r = new Rodent[10];
        for(int i = 0; i < r.length; i++) {
            r[i] = RodentGen.next();
            System.out.println();
        }
        for(Rodent i : r) {
            i.eat(); i.run(); i.sleep();
            System.out.println();
        }
    }
}
