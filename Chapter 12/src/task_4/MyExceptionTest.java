package task_4;

class MyException extends Exception {
    private String msg;
    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }
    public String getMsg() { return msg; }
}

public class MyExceptionTest {
    public static void main(String[] args) {
        try {
            throw new MyException("MyException message");
        } catch(MyException e) {
            System.out.println(e.getMsg());
        }
    }
}
