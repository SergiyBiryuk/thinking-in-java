package task_21;

import java.util.Date;



class SimpleProxy implements Interface {
    private Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    @Override public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }
    @Override public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        long timer = new Date().getTime();
        iface.doSomething();
        timer = new Date().getTime() - timer;
        System.out.println("CallTime = " + timer);

        timer = new Date().getTime();
        iface.somethingElse("bonobo");
        timer = new Date().getTime() - timer;
        System.out.println("CallTime = " + timer);
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
