package task_15;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import net.mindview.util.TextFile;

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
        int flags = 0;
        for(int i = 2; i < args.length; i++)
            flags |= checkFlag(args[i]);
        Pattern p = Pattern.compile(args[1]);
        int index = 0;
        Matcher m = p.matcher("");
        for(String line : new TextFile(args[0])) {
            index++;
            m.reset(line);
            while(m.find())
                System.out.println(index + ": " + m.group() + ": " + m.start());
        }
    }
}
