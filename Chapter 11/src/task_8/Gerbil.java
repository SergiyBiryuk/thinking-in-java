package task_8;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerbil {
    private final int gerbilNumber;
    public Gerbil(int gerbilNumber) { this.gerbilNumber = gerbilNumber; }
    public void hop() { System.out.println(gerbilNumber + " " + this); }

    public static void main(String[] args) {
        ArrayList<Gerbil> array = new ArrayList<Gerbil>();
        for(int i = 0; i < 10; i++)
            array.add(new Gerbil(i));

        for(Iterator<Gerbil> it = array.iterator(); it.hasNext(); it.next().hop());
    }
}

