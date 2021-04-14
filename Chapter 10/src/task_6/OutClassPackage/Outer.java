package task_6.OutClassPackage;

import task_6.InterfacePackage.MyInterface;

public class Outer {
    public Outer() {}
    protected class Inner implements MyInterface {
        public Inner() {}
        @Override public void function() { System.out.println("Inner.function()"); }
    }
}
