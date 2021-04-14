package task_8;

class MyException extends Exception {
    private String msg;
    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }
    public String getMsg() { return msg; }
}

public class SpecificException {
    public static void throwMyException() throws MyException { throw new MyException("this is my exception"); }
    public static void main(String[] args) {
        try {
            throwMyException();
        } catch(MyException e) {
            System.err.println(e.getMsg());
        }
    }
}
