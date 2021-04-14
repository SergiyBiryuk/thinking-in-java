package task_2;

public class Detergent extends Cleaner {

    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }
    public void foam() { append(" foam()"); }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Проверяем базовый класс");
        Cleaner.main(args);
    }
}
