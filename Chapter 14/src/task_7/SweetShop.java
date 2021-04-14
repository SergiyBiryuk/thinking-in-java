package task_7;

class Candy {
    static { System.out.println("Загрузка класса Candy"); }
}

class Gum {
    static { System.out.println("Загрузка класса Gum"); }
}

class Cookie {
    static { System.out.println("Загрузка класса Cookie"); }
}

public class SweetShop {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Use: java SweetShop [ClassName]");
            System.exit(1);
        }
        Class c = null;
        try {
            c = Class.forName("task_7." + args[0]);
        } catch(ClassNotFoundException e) {
            System.out.println("Не удалось найти " + args[0]);
        }
        if(c == Candy.class) {
            new Candy();
            System.out.println("После создания объекта Candy");
        }
        if(c == Gum.class) {
            try {
                Class.forName("task_7.Gum");
            } catch (ClassNotFoundException e) {
                System.out.println("Не удалось найти Gum");
            }
            System.out.println("После вызова метода Class.forName(\"Gum\")");
        }
        if(c == Cookie.class) {
            new Cookie();
            System.out.println("После создния объекта Cookie");
        }
    }
}
