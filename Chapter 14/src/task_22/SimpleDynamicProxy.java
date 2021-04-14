package task_22;

import task_21.Interface;
import task_21.RealObject;

import java.lang.reflect.*;
import java.util.Date;

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args:" + args);
        if(args != null)
            for(Object arg : args)
                System.out.println(" " + arg);
        return method.invoke(proxied, args);
    }
}

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        long timer = new Date().getTime();
        iface.doSomething();
        timer = new Date().getTime() - timer;
        System.out.println("CallTime = " + timer);

        long timer2 = new Date().getTime();
        iface.somethingElse("bonobo");
        timer2 = new Date().getTime() - timer2;
        System.out.println("CallTime = " + timer2);
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
