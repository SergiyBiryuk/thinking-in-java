package task_9;

interface Interface {
    String getLabel();
}

public class Main {
    public static Interface qwe(String str) {
        class Inner implements Interface {
            private String label;
            public Inner(String label) { this.label = label; }
            public String getLabel() { return label; }
        }
        return new Inner(str);
    }
    public static void main(String[] args) {
        Interface i = Main.qwe("Qwerty");
        System.out.println(i.getLabel());
    }
}
