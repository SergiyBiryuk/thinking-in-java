package task_10;

class MyExceptionOne extends Exception {
    public MyExceptionOne(String msg) { super(msg); }
}
class MyExceptionTwo extends Exception {
    public MyExceptionTwo(String msg) { super(msg); }
}

public class Rethrowing {
    public static void g() throws MyExceptionOne {
        System.out.println("In method Rethrowing.g()");
        throw new MyExceptionOne("From method g()");
    }
    public static void f() throws MyExceptionTwo {
        System.out.println("In method Rethrowing.f()");
            try {
                Rethrowing.g();
            } catch (MyExceptionOne e) {
                System.out.println("Catched in method f()");
                e.printStackTrace(System.out);
                throw new MyExceptionTwo("From method f()");
            }
    }

    public static void main(String[] args) {
        try {
            Rethrowing.g();
        } catch(MyExceptionOne e) {
            System.out.println("Catched in Main");
            e.printStackTrace(System.out);
        }
        try {
            Rethrowing.f();
        } catch(MyExceptionTwo e) {
            System.out.println("Catched in Main");
            e.printStackTrace(System.out);
        }
    }
}
