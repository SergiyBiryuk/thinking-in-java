package task_10;

import java.util.regex.*;

public class RegularExpressions {

    public static String str = "Java now has regular expressions";
    public static String[] regexArray = { "^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}", "s{0,3}" };

    public static void main(String[] args) {
        System.out.println(str);
        for(String regex : regexArray) {
            Matcher m = Pattern.compile(regex).matcher(str);
            System.out.println(regex);
            System.out.format("%15s: find()\n", "");
            while(m.find())
                System.out.format("%20s \"%s\" at positions %d-%d\n", "", m.group(), m.start(), m.end());
            System.out.format("%-15s: matches() = %b, lookingAt() = %b\n", regex, m.matches(), m.lookingAt());
            System.out.println("====================================");
        }
    }
}
