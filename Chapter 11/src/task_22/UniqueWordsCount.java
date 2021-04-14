package task_22;

import net.mindview.util.TextFile;

import java.util.*;

class Word {
    private String word;
    private int count;
    public Word(String word) { this.word = word; count++; }
    public final String getWord() { return word; }
    public final void incCount() { count++; }
    @Override public String toString() { return word + "=" + count; }
}

public class UniqueWordsCount {

    public static Word contains(Set<Word> set, String word) {
        for(Word w : set)
            if(w.getWord().equals(word))
                return w;
        return null;
    }

    public static void main(String[] args) {
        List<String> text = new ArrayList<String>(new TextFile("C:\\Users\\Sergey\\IdeaProjects\\Thinking in Java\\Chapter 11\\src\\task_13\\GreenhouseControls.java", "\\W+"));
        Collections.sort(text, String.CASE_INSENSITIVE_ORDER);
        Set<Word> set = new LinkedHashSet<Word>();
        for(String word : text) {
            Word w = UniqueWordsCount.contains(set, word);
            if(w == null)
                set.add(new Word(word));
            else
                w.incCount();
        }
        for(Word w : set)
            System.out.println(w);
    }
}
