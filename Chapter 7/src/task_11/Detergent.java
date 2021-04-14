package task_11;

public class Detergent {

    private Cleaner c;

    Detergent() { c = new Cleaner(); }

    public void dilute() { c.dilute(); }
    public void apply() { c.apply(); }
    public void scrub() { c.append(" Detergent.scrub()"); c.scrub(); }
    public void foam() { c.append(" foam()"); }

    public String toString() { return c.toString(); }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        System.out.println();
        x.dilute(); x.apply(); x.scrub(); x.foam();
        System.out.println(x);
        System.out.println("Проверяем базовый класс");
        Cleaner.main(args);
    }
}
