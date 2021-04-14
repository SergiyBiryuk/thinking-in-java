package task_14;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.*;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!", 3)));
    }
}
