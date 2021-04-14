package task_11;

import java.util.regex.*;

public class RegularExpression {

    public static Matcher m = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b")
            .matcher("Arline ate eight apples and one orange while Anita hadn's any");

    public static void main(String[] args) {
        while(m.find())
            System.out.format("\"%s\" at positions %d-%d\n", m.group(), m.start(), m.end());
        System.out.println(m.matches());
        System.out.println(m.lookingAt());
    }
}
