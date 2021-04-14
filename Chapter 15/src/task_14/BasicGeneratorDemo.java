package task_14;

import net.mindview.util.Generator;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        System.out.println();
        Generator<CountedObject> _gen = new BasicGenerator<CountedObject>(CountedObject.class);
        for(int i = 0; i < 6; i++)
            System.out.println(_gen.next());
    }
}
