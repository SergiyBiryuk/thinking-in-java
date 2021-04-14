package task_11;

public class Cleaner {

   private String s = "Cleaner";

    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }

    public String toString() { return s; }

    public static void main(String[] args) {
        Cleaner x = new Cleaner();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
