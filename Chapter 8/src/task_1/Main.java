package task_1;

class Cycle {
    public void ride() { System.out.println("Cycle ride"); }
}
class Unicycle extends Cycle {
    @Override public void ride() { System.out.println("Unicycle ride"); }
}
class Bicycle extends Cycle {
    @Override public void ride() { System.out.println("Bicycle ride"); }
}
class Tricycle extends Cycle {
    @Override public void ride() { System.out.println("Tricycle ride"); }
}

public class Main {
    private void use(Cycle c) { c.ride(); }
    public static void main(String[] args) {
        Main m = new Main();
        m.use(new Cycle());
        m.use(new Unicycle());
        m.use(new Bicycle());
        m.use(new Tricycle());
    }
}
