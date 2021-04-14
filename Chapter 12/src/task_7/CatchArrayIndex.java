package task_7;

import java.io.*;
import java.util.logging.*;

public class CatchArrayIndex {

    static int[] array = new int[10];
    private static Logger logger = Logger.getLogger("ArrayException");

    public static void logException(ArrayIndexOutOfBoundsException e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    static void add(int i) {
        array[i] = i;
    }
    public static void main(String[] args) {
        try {
            for (int i = 0; ; i++)
                add(i);
        } catch(ArrayIndexOutOfBoundsException e) {
            logException(e);
        }
    }
}
