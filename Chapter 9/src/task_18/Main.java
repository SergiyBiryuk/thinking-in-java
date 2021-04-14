package task_18;

interface CycleFactory {
    Cycle getCycle();
}
interface Cycle {
    void ride();
}

class UnicycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Unicycle(); }
}
class Unicycle implements Cycle {
    private final byte WHEELS_COUNT = 1;
    Unicycle() {}
    public void ride() { System.out.println("Riding " + getClass().getSimpleName() + "  with " + WHEELS_COUNT + " wheel"); }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Bicycle(); }
}
class Bicycle implements Cycle {
    private final byte WHEELS_COUNT = 2;
    Bicycle() {}
    public void ride() { System.out.println("Riding " + getClass().getSimpleName() + "  with " + WHEELS_COUNT + " wheels"); }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() { return new Tricycle(); }
}
class Tricycle implements Cycle {
    private final byte WHEELS_COUNT = 3;
    Tricycle() {}
    public void ride() { System.out.println("Riding " + getClass().getSimpleName() + "  with " + WHEELS_COUNT + " wheels"); }
}

public class Main {
    public static void rideSomeCycle(CycleFactory f) {
        f.getCycle().ride();
    }
    public static void main(String[] args) {
        rideSomeCycle(new UnicycleFactory());
        rideSomeCycle(new BicycleFactory());
        rideSomeCycle(new TricycleFactory());
    }
}
