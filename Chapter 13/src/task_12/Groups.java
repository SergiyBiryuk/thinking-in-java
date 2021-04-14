package task_12;

import java.util.*;
import java.util.regex.*;

public class Groups {
    public static final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\b\\p{javaLowerCase}\\w*\\b").matcher(POEM);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        while(m.find()) {
            String word = m.group();
            Integer count = map.get(word);
            map.put(word, count == null ? 1 : count + 1);
        }
        System.out.println(map);
        System.out.format("Count = %d", map.size());
    }
}
