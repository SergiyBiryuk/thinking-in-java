package task_19;
// Qwewewew
import java.util.*;
import java.util.regex.*;
import net.mindview.util.*;
/*  Treefrgt gdsdt Yhyjtyj
 *a Hgergerger *
  * Yuio */
public class ClassnamePattern {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<String>();

        if (args.length < 1) {
            System.out.println("Usage: java ClassnamePattern [fileName]");
            System.exit(0);
        }

        Pattern p = Pattern.compile("\\b\\p{javaUpperCase}\\w*");
        Matcher m = p.matcher("");

        int index = 0;
        for(String line : new TextFile(args[0])) {
            line = line.replaceAll("(/ {0}/.*$)|(/\\*.*)|(.*\\*/)|( \\*.*\\*)|(\".*\")", "");
            m.reset(line);
            while(m.find())
                set.add(m.group());
        }

        System.out.println(set);
    }
}
