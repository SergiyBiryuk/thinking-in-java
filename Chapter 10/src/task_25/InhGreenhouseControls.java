package task_25;

public class InhGreenhouseControls extends GreenhouseControls {
    private boolean humidifier = false;
    public class HumidifierOn extends Event {
        public HumidifierOn(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... HumidifierOn hardware code
            humidifier = true;
        }
        @Override public String toString() { return "Увлажнитель включен"; }
    }
    public class HumidifierOff extends Event {
        public HumidifierOff(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... HumidifierOff hardware code
            humidifier = false;
        }
        @Override public String toString() { return "Увлажнитель выключен"; }
    }
}
