package task_13;

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

    public static void throwException(Integer i) throws ExceptionOne, ExceptionTwo, ExceptionThree {
        if(i == null)
            throw new NullPointerException("i == null");
        else if(i < 0)
            throw new ExceptionOne("i < 0");
        else if(i > 0)
            throw new ExceptionThree("i > 0");
        else
            throw new ExceptionTwo("i == 0");
    }

    public static void main(String[] args) {
        for (int i = -1; i < 3; i++) {
            try {
                if(i == 2)
                    throwException(null);
                throwException(i);
            } catch(ExceptionOne e) {
                System.err.println("Caught ExceptionOne");
                e.printStackTrace();
            } catch(ExceptionTwo e) {
                System.err.println("Caught ExceptionTwo");
                e.printStackTrace();
            } catch(ExceptionThree e) {
                System.err.println("Caught ExceptionThree");
                e.printStackTrace();
            } finally {
                System.err.println("Finally block\n");
            }
        }
    }

}
