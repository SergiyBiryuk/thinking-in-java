package task_2;

public class Test extends Detergent {

    public void scrub() {
        append(" Test.scrub()");
        super.scrub();
    }

    public void sterilize() { append(" sterilize()"); }

    public static void main(String[] args) {
        Test x = new Test();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        System.out.println("Проверяем промежуточный класс");
        Detergent.main(args);
    }
}
