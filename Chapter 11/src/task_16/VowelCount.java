package task_16;

import java.util.*;
import net.mindview.util.TextFile;

public class VowelCount {
    static int q = 0;
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<Character>();
        Collections.addAll(vowels, 'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y');
        Set<String> text = new TreeSet<String>(new TextFile("C:\\Users\\Sergey\\IdeaProjects\\Thinking in Java\\Chapter 11\\src\\task_13\\GreenhouseControls.java", "\\W+"));
        int globalCount = 0;
        for(String word : text) {
            int localCount = 0;
            char[] chars = word.toCharArray();
            for(char c : chars)
                if (vowels.contains(c))
                    localCount++;
            System.out.print(word + ": " + localCount + "; ");
            if(++q % 10 == 0) System.out.println();
            globalCount += localCount;
        }
        System.out.println("\n" + "globalCount = " + globalCount);
    }
}
