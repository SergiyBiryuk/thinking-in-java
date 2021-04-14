package task_6;

import task_6.InheritedClass.Inherited;
import task_6.InterfacePackage.MyInterface;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = new Inherited().getInner();
        myInterface.function();
    }
}
