package task_12;

import task_11.TypeCounter;
import generics.coffee.*;

public class CoffeeCount {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        CoffeeGenerator generator = new CoffeeGenerator();
        for(int i = 0; i < 20; i++)
            counter.count(generator.next());
        System.out.println(counter);
    }
}
