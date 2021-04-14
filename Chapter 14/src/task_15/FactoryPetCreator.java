package task_15;

import java.util.*;
import task_15.mypets.*;
import typeinfo.factory.Factory;

public class FactoryPetCreator extends PetCreator {
    public static List<Class<? extends Factory<? extends Pet>>> allFactoryTypes = Arrays.asList(
            Cat.Factory.class,
            Manx.Factory.class, Cymric.Factory.class, EgyptianMau.Factory.class,
            Dog.Factory.class,
            Pug.Factory.class, Mutt.Factory.class,
            Rodent.Factory.class,
            Gerbil.Factory.class, Hamster.Factory.class, Mouse.Factory.class, Rat.Factory.class
    );
    @Override public List<Class<? extends Factory<? extends Pet>>> types() {
        return allFactoryTypes;
    }

    public static void main(String[] args) {
        System.out.println(allFactoryTypes);
    }
}
