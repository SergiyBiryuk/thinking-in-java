package task_12;

public class GC {

    static void test() {
        Tank t1 = new Tank(1);
        Tank t2 = new Tank(2,5);
        Tank t3 = new Tank(3,10);
        Tank t4 = new Tank(4);
        t4.changeFill(0);
        t2.changeFill(0);
        t1 = null;
        t2 = null;
        t3 = null;
        t4 = null;
    }

    public static void main(String[] args) {
        test();
        System.gc();
    }
}

class Tank {
    int fill;
    int name;
    Tank(int name) { this.name = name; }
    Tank(int name, int fill) { this.name = name; this.fill = fill; }

    public void changeFill(int fill) { this.fill = fill; }

    public void finalize() {
        if(fill != 0) System.out.println("Error! Tank is not empty!");
        else System.out.println("Good! Tank destroyed!");

    }
}
