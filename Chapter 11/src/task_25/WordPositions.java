package task_25;

import java.util.*;
import net.mindview.util.TextFile;

public class WordPositions {
    public static int globalWordCounter;
    public static void main(Map<String, ArrayList<Integer>> map) { // need for the next task
    //public static void main(String[] args) { // need for the next task
        // Map<String, ArrayList<Integer>> map = new TreeMap<String, ArrayList<Integer>>();
        List<String> text = new TextFile("C:\\Users\\Sergey\\IdeaProjects\\Thinking in Java\\Chapter 11\\src\\task_13\\GreenhouseControls.java", "\\W+");
        for(int i = 0; i < text.size(); i++)
            System.out.print(text.get(i) + "=[" + i + "], ");
        System.out.println("\n" + text);
        for(Iterator<String> it = text.iterator(); it.hasNext();) {
            String key = it.next();
            ArrayList<Integer> value = map.get(key);
            if(value == null)
                value = new ArrayList<Integer>();
            value.add(globalWordCounter++);
            map.put(key, value);
        }
        System.out.println(map);
    }
}
