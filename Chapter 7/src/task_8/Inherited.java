package task_8;

import java.util.Random;

class Inherited extends Basic {

    public Inherited() {
        super(-1);
//        OR
//        this(new Random().nextInt(100));
        System.out.println("Inherited constructor withOUT argument ");
    }

    public Inherited(int i) {
        super(i);
        System.out.println("Inherited constructor with argument " + i);
    }

    public static void main(String[] args) {
        Inherited _1 = new Inherited();
        Inherited _2 = new Inherited(new Random().nextInt(100));
    }

}
