package task_2;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface MyInterface {}

class Toy {
    Toy() {}
    Toy(int i) {}
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
        Class c = null;
        try {
            c = Class.forName("task_2.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Не удаётся найти FancyToy");
            System.exit(2);
        }
        printInfo(c);
        for(Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Не удаётся создать экземпляр");
            System.exit(2);
        } catch (IllegalAccessException e) {
            System.out.println("Отказано в доступе");
            System.exit(2);
        }
        printInfo(obj.getClass());
    }
}
