package task_9;

import task_4.Constructor;

public class ConstructorThis {

    int i;

    ConstructorThis(int i) {
        this.i = i;
    }
    ConstructorThis() {
        this(5);
    }

    public static void main(String[] args) {
        ConstructorThis c = new ConstructorThis();
        System.out.println(c.i);

        ConstructorThis v = new ConstructorThis(10);
        System.out.println(v.i);

    }
}
