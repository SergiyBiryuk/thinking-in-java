package task_11;

interface Interface {
    String getLabel();
}

class Outer {
    public Outer() { System.out.println("Outer.Outer()"); }
    private class Inner implements Interface {
        private String label;
        public Inner(String label) {
            System.out.println("Inner.Inner()");
            this.label = label;
        }
        public String getLabel() { return label; }
    }
    public Interface getInner(String label) { return new Inner(label); }
}

public class Main {
    public static void main(String[] args) {
        Interface i = new Outer().getInner("QweewQ");
        System.out.println(i.getLabel());
        System.out.println(new Outer().getInner("QweewQ").getLabel());
        // !!! (Outer.Inner).getLabel();
    }
}
