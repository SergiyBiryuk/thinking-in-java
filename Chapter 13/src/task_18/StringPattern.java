package task_18;

import java.util.regex.*;
import net.mindview.util.*;

public class StringPattern {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Usage: java StringPattern [fileName]");
            System.exit(0);
        }
        Pattern p = Pattern.compile("\".*\"");
        Matcher m = p.matcher("");

        int index = 0;
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group());
        }
    }
}