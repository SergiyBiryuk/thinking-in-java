package task_15;

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
    Cheeks() { System.out.println("Cheeks()"); }
}
class Ball {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Ball() { System.out.println("Create " + this); }

    public void addref() { refcount++; }
    protected void dispose() {
        if(--refcount == 0)
            System.out.println("Disposing " + this);
    }

    public String toString() { return "Ball " + id; }
}

class Rodent {

    private static long counter = 0;
    protected final long id = counter++;
    private Ball ball = null;

    public void giveBall(Ball ball) {
        System.out.println("GIVING BALL " + ball + " TO " + this.getClass().getName() + " " + id);
        this.ball = ball;
        this.ball.addref();
    }
    public void takeBall() {
        System.out.println("TAKING BALL " + ball + " TO " + this.getClass().getName() + " " + id);
        ball.dispose();
        ball = null;
    }
    public void showBall() {
        System.out.println(this.getClass().getName() + " " + id + " " + ball);
    }

    protected Nose n = new Nose();
    protected Paw[] paws = new Paw[4]; {
        for(int i = 0; i < paws.length; i++)
            paws[i] = new Paw();
    }

    public Rodent() { System.out.println("Rodent() " + id); }

    public void eat() { System.out.println("Rodent.eat()"); }
    public void sleep() { System.out.println("Rodent.sleep()"); }
    public void run() { System.out.println("Rodent.run()"); }
}

class Mouse extends Rodent {

    protected Tail t = new Tail();

    public Mouse() { System.out.println("Mouse() " + id); }

    @Override public void eat() { System.out.println("Mouse.eat()"); }
    @Override public void sleep() { System.out.println("Mouse.sleep()"); }
    @Override public void run() { System.out.println("Mouse.run()"); }
}

class Hamster extends Rodent {

    protected Cheeks c = new Cheeks();

    public Hamster() { System.out.println("Hamster() " + id); }

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
        Ball ball_0 = new Ball();
        Ball ball_1 = new Ball();

        for(int i = 0; i < r.length / 2; i++)
            r[i].giveBall(ball_0);
        for(int i = r.length / 2; i < r.length; i++)
            r[i].giveBall(ball_1);

        for(Rodent i : r)
            i.showBall();

        for(Rodent i : r)
            i.takeBall();
    }
}
