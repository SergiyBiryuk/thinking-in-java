package task_3;

abstract class Basic {
    public Basic() { print(); }
    public abstract void print();
}
class Inherited extends Basic {
   int i = 5;
    @Override public void print() { System.out.println(i); }
}

public class Main {
    public static void main(String[] args) {
        Basic i = new Inherited();
        i.print();
    }
}
