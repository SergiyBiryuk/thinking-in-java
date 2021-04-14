package task_10;

interface Interface {
    String getLabel();
}

public class Main {
    private void qwe(boolean state) {
        if(state) {
            class Inner implements Interface {
                private String label;
                public Inner(String label) { this.label = label; }
                public String getLabel() { return label; }
            }
            Inner i = new Inner("Qwe");
            String s = i.getLabel();
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.qwe(true);
    }
}
