package task_8;

import net.mindview.util.Generator;
import task_8.Characters.*;
import java.util.*;

public class StoryCharacterGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {

    private Class[] types = { CaptainAmerica.class, GreenGoblin.class, IronMan.class, Loki.class, SpiderMan.class,
    Thanos.class, Thor.class, Ultron.class, Venom.class, Wolverine.class };

    private Random rand = new Random();

    public StoryCharacterGenerator() {}

    private int size = 0;
    public StoryCharacterGenerator(int size) { this.size = size; }

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters)types[rand.nextInt(types.length)].newInstance();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new Iterator<StoryCharacters>() {
            int i = 0;
            @Override
            public boolean hasNext() { return i < size; }

            @Override
            public StoryCharacters next() {
                i++;
                return StoryCharacterGenerator.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        StoryCharacterGenerator scg = new StoryCharacterGenerator();
        for(int i = 0; i < 10; i++)
            System.out.print(scg.next().getClass().getSimpleName() + " ");
        System.out.println();
        for(StoryCharacters sc : new StoryCharacterGenerator(15))
            System.out.print(sc.getClass().getSimpleName() + " ");
    }
}
