package task_13;

import task_11.TypeCounter;

public class PartTypes {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        for(int i = 0; i < 20; i++)
            counter.count(Part.createRandom());
        System.out.println(counter);
    }
}
