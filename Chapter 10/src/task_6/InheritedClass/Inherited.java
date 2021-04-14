package task_6.InheritedClass;

import task_6.InterfacePackage.MyInterface;
import task_6.OutClassPackage.Outer;

public class Inherited extends Outer {
    public Inherited() {}
    public MyInterface getInner() { return new Inner(); }
}