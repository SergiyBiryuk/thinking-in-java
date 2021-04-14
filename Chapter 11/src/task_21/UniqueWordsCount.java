package task_21;

import java.util.*;

import net.mindview.util.TextFile;


public class UniqueWordsCount {
    public static void main(String[] args) {
        List<String> text = new ArrayList<String>(new TextFile("C:\\Users\\Sergey\\IdeaProjects\\Thinking in Java\\Chapter 11\\src\\task_13\\GreenhouseControls.java", "\\W+"));
        Collections.sort(text, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> wordsMap = new LinkedHashMap<String, Integer>();
        for(String word : text) {
                Integer count = wordsMap.get(word);
                wordsMap.put(word, count == null ? 1 : count + 1);
        }
        System.out.println(wordsMap.size() + " Words total");
        System.out.println(wordsMap);
    }
}
