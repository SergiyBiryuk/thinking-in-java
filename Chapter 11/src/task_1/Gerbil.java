package task_1;

import java.util.ArrayList;

public class Gerbil {
    private final int gerbilNumber;
    public Gerbil(int gerbilNumber) { this.gerbilNumber = gerbilNumber; }
    public void hop() { System.out.println(gerbilNumber + " " + this); }

    public static void main(String[] args) {
        ArrayList<Gerbil> array = new ArrayList<Gerbil>();
        for(int i = 0; i < 10; i++)
            array.add(new Gerbil(i * 2 + i / 2));
        for(int i = 0; i < 10; i++)
            array.get(i).hop();
    }
}

