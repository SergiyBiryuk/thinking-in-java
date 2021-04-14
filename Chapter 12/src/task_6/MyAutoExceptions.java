package task_6;

import java.io.*;
import java.util.logging.*;

class MyExceptionOne extends Exception {
    private static Logger logger = Logger.getLogger("EXCEPTION ONE");
    public MyExceptionOne() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class MyExceptionTwo extends Exception {
    private static Logger logger = Logger.getLogger("EXCEPTION TWO");
    public MyExceptionTwo() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class MyAutoExceptions {
    static void one() throws MyExceptionOne {
        System.out.println("In \"one\" method.");
        throw new MyExceptionOne();
    }
    static void two() throws MyExceptionTwo {
        System.out.println("In \"two\" method.");
        throw new MyExceptionTwo();
    }

    public static void main(String[] args) {
        try {
            one();
        } catch(MyExceptionOne e) {
            System.err.println("Перехвачено " + e);
        } finally {
            System.out.println("ONE Finally block\n");
        }
        try {
            two();
        } catch(MyExceptionTwo e) {
            System.err.println("Перехвачено " + e);
        } finally {
            System.out.println("TWO Finally block\n");
        }
    }
}
