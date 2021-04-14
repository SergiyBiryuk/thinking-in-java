package task_16;

import net.mindview.util.TextFile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    private static int checkFlag(String flag) {
        if(flag.equals("UNIX_LINES"))                   return 0x01;
        else if(flag.equals("CASE_INSENSITIVE"))        return 0x02;
        else if(flag.equals("COMMENTS"))                return 0x04;
        else if(flag.equals("MULTILINE"))               return 0x08;
        else if(flag.equals("LITERAL"))                 return 0x10;
        else if(flag.equals("DOTALL"))                  return 0x20;
        else if(flag.equals("UNICODE_CASE"))            return 0x40;
        else if(flag.equals("CANON_EQ"))                return 0x80;
        else if(flag.equals("UNICODE_CHARACTER_CLASS")) return 0x100;
        else if(flag.equals("ALL_FLAGS"))               return 0x1FF;
        return 0;
    }

    public static void main(String[] args) throws Exception {

        if(args.length < 2) {
            System.out.println("Usage: java JGrep [file] [regex] [flags]");
            System.exit(0);
        }

        File[] files;
        if((files = new File(args[0]).listFiles()) == null)
            files = new File[] { new File(args[0]) };

        int flags = 0;
        for(int i = 2; i < args.length; i++)
            flags |= checkFlag(args[i]);

        Pattern p = Pattern.compile(args[1]);
        Pattern lp = Pattern.compile("\\w+\\.\\w+$");
        Matcher m = p.matcher("");

        int index = 0;
        for(File file : files) {
            Matcher lm = lp.matcher(file.toString());
            if(lm.find()) {
                System.out.println("\n" + file.toString().toUpperCase());
                for (String line : new TextFile(file.toString())) {
                    m.reset(line);
                    while (m.find())
                        System.out.println(index++ + ": " + m.group() + ": " + m.start());
                }
            }
        }
    }
}
