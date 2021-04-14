package task_18;

class Cycle {
    public void ride() { System.out.println("Cycle ride"); }
}

class Unicycle extends Cycle {
    @Override public void ride() { System.out.println("Unicycle ride"); }
    public void balance() { System.out.println("Unicycle balance"); }
}

class Bicycle extends Cycle {
    @Override public void ride() { System.out.println("Bicycle ride"); }
    public void balance() { System.out.println("Bicycle balance"); }
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
        Cycle[] cycle = {new Unicycle(), new Bicycle(), new Tricycle()};
        // !!! cycle[0].balance();
        // !!! cycle[1].balance();
        // !!! cycle[2].balance();
        ((Unicycle)cycle[0]).balance();
        ((Bicycle)cycle[1]).balance();
        // !!! ((Tricycle)cycle[2]).balance();
    }
}
