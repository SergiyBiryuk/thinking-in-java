package task_6;

import task_6.pack.MyInterface;

public class Main implements MyInterface {
    @Override public void first() { System.out.println("first()"); }
    // !!! @Override protected void first() { System.out.println("first()"); }
    @Override public void second() { System.out.println("second()"); }
    // !!! @Override protected void second() { System.out.println("second()"); }
    @Override public void third() { System.out.println("third()"); }
    // !!! @Override protected void third() { System.out.println("third()"); }

    public static void main(String[] args) {
        Main main = new Main();
        main.first();
        main.second();
        main.third();
    }
}
