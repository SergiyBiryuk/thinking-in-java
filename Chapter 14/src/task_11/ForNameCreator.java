package task_11;

import task_11.mypets.*;

import java.util.*;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    private static String[] typeNames = {
            "task_11.mypets.Mutt",
            "task_11.mypets.Pug",
            "task_11.mypets.EgyptianMau",
            "task_11.mypets.Manx",
            "task_11.mypets.Cymric",
            "task_11.mypets.Rat",
            "task_11.mypets.Mouse",
            "task_11.mypets.Hamster",
            "task_11.mypets.Gerbil"
    };
    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for(String name : typeNames)
                types.add((Class<? extends Pet>)Class.forName(name));
        } catch(ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    static { loader(); }
    @Override public List<Class<? extends Pet>> types() { return types; }
}
