package task_20;

import net.mindview.util.TextFile;

import java.util.*;

public class VowelCount {
    public static void main(String[] args) {
        Map<Character, Integer> vowels = new HashMap<Character, Integer>();
        vowels.put('A', 0); vowels.put('E', 0); vowels.put('I', 0); vowels.put('O', 0); vowels.put('U', 0); vowels.put('Y', 0);
        vowels.put('a', 0); vowels.put('e', 0); vowels.put('i', 0); vowels.put('o', 0); vowels.put('u', 0); vowels.put('y', 0);
        Set<String> text = new TreeSet<String>(new TextFile("C:\\Users\\Sergey\\IdeaProjects\\Thinking in Java\\Chapter 11\\src\\task_20\\VowelCount.java", "\\W+"));
        int globalCount = 0;
        for(String word : text) {
            char[] chars = word.toCharArray();
            for(char c : chars)
                if (vowels.containsKey(c)) {
                    vowels.replace(c, vowels.get(c) + 1);
                }
        }
        System.out.println(vowels);
        System.out.println("\n" + "globalCount = " + globalCount);
    }
}
