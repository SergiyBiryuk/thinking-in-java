package task_19;

import javax.management.MBeanConstructorInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface MyInterface {}

class Toy {
    int i;
    Toy() { System.out.println("Constructor without arguments."); }
    Toy(int i) { this.i = i; System.out.println("Constructor with Integer argument."); }
    @Override public String toString() { return Integer.toString(i); }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, MyInterface {
    FancyToy() { super(1); }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Имя класса : " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноническое имя: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class<Toy> c = Toy.class;
        try {
            Constructor ctor = c.getDeclaredConstructor(int.class);
            Toy t = (Toy)ctor.newInstance(5);
            System.out.println(t);
        } catch (NoSuchMethodException e) {
            System.err.println("NoSuchMethodException " + e);
        } catch (InstantiationException e) {
            System.err.println("InstantiationException " + e);
        } catch (IllegalAccessException e) {
            System.err.println("IllegalAccessException " + e);
        } catch (InvocationTargetException e) {
            System.err.println("InvocationTargetException " + e);
        }
    }
}
