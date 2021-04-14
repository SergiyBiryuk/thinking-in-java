package task_17;
/*qweqweqwe
qweqwe*/
import java.util.regex.*;
import net.mindview.util.TextFile; /*  qwe qweqweqweqweqwe qw eqwesf er etg45g4 5 45    */
//qweqweqwe
// qweqweqweqweqwe
public class CommentPattern {// x    d fsd fsd f6f84 sd68 f4sd6 f1sf89w/e f+we4  3f ,
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.out.println("Usage: java CommentPattern [fileName]");
            System.exit(0);
        }
        Pattern monoP = Pattern.compile("/ {0}/.*$");
        Pattern multiP = Pattern.compile("/\\*.*?\\*/");
        int index = 0;
        Matcher m = monoP.matcher("");
        System.out.println(args[0] + " comments: ");
        TextFile text = new TextFile(args[0]);
        for(String line : text) {
            m.reset(line);
            while(m.find())// zcvxcvxcvxcvxcv
                System.out.println(index++ + ": " + m.group());
        }
        m = multiP.matcher(text.toString().replaceAll(", ", " '\\\\n' "));
        while(m.find())
            System.out.println(index++ + ": " + m.group());
    }
}

/* qweqweqeqeqweqweqweqweqwe
 * dfbfgntmtyjtyj5yj
 asdasd*/