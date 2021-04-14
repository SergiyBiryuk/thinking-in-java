package task_25;

class AException extends Exception {}
class BException extends AException {}
class CException extends BException {}

class A {
    public void f() throws AException {
        throw new AException();
    }
}
class B extends A {
    @Override public void f() throws BException {
        throw new BException();
    }
}
class C extends B {
    @Override public void f() throws CException {
        throw new CException();
    }
}

public class IdentExceptions {
    public static void main(String[] args) {
        A x = new C();
        try {
            x.f();
        } catch (CException e) {
            System.out.println("CException block");
        } catch (BException e) {
            System.out.println("BException block");
        } catch (AException e) {
            System.out.println("AException block");
        }
    }
}
