package task_9;

class ExceptionOne extends Exception {
    public ExceptionOne(String msg) { super(msg); }
}
class ExceptionTwo extends Exception {
    public ExceptionTwo(String msg) { super(msg); }
}
class ExceptionThree extends Exception {
    public ExceptionThree(String msg) { super(msg); }
}

public class ThreeToOneException {
    private static int i = -2;
    public static void throwException() throws ExceptionOne, ExceptionTwo, ExceptionThree {
        if(++i == 2) System.exit(0);
        else if(i < 0) throw new ExceptionOne("i < 0");
        else if(i == 0) throw new ExceptionTwo("i == 0");
        else if(i > 0) throw new ExceptionThree("i > 0");
    }
    public static void main(String[] args) {
        while(true) {
            try {
                throwException();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
