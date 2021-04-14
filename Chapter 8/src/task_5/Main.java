package task_5;

class Cycle {
    public void ride() { System.out.println("Cycle ride " + wheels()); }
    public int wheels() { return 0;}
}

class Unicycle extends Cycle {
    @Override public void ride() { System.out.println("Unicycle ride " + wheels()); }
    @Override public int wheels() { return 1;}
}

class Bicycle extends Cycle {
    @Override public void ride() { System.out.println("Bicycle ride " + wheels()); }
    @Override public int wheels() { return 2;}
}

class Tricycle extends Cycle {
    @Override public void ride() { System.out.println("Tricycle ride " + wheels()); }
    @Override public int wheels() { return 3;}
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
