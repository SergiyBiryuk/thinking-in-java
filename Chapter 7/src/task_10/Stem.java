package task_10;

import java.util.Random;

public class Stem extends Root {
    int i;
    Stem(int i) {
        super(i);
        this.i = i;
        System.out.println("Stem constructor " + i);
    }

    Component1 c1 = new Component1(i);
    Component2 c2 = new Component2(i);
    Component3 c3 = new Component3(i);
}
