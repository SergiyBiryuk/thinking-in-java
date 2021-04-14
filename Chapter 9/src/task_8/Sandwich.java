package task_8;

interface FastFood {
    void eatSandwich();
    void throwSandwich();
}

class Meal {
    Meal() { System.out.println("Meal()"); }
}

class Bread {
    Bread() { System.out.println("Bread()"); }
}

class Cheese {
    Cheese() { System.out.println("Cheese()"); }
}

class Lettuce {
    Lettuce() { System.out.println("Lettuce()"); }
}

class Lunch extends Meal {
    Lunch() { System.out.println("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { System.out.println("PortableLunch()"); }
}

public class Sandwich extends PortableLunch implements FastFood {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() { System.out.println("Sandwich()"); }

    @Override public void eatSandwich() { System.out.println("Eating Sandwich " + this); }
    @Override public void throwSandwich() { System.out.println("Trowing Sandwich " + this); }

    public static void main(String[] args) {
        Sandwich s = new Sandwich();
        s.eatSandwich();
        s = new Sandwich();
        s.throwSandwich();
    }
}
