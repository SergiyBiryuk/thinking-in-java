package task_24;

class GreenhouseControls extends Controller {
    private boolean light = false;
    public class LightOn extends Event {
        public LightOn(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... LightOn hardware code
            light = true;
        }
        @Override public String toString() { return "Свет включен"; }
    }
    public class LightOff extends Event {
        public LightOff(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... LightOff hardware code
            light = false;
        }
        @Override public String toString() { return "Свет выключен"; }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... WaterOn hardware code
            water = true;
        }
        @Override public String toString() { return "Полив включен"; }
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... WaterOff hardware code
            water = false;
        }
        @Override public String toString() { return "Полив выключен"; }
    }

    private boolean ventilation = false;
    public class VentilationOn extends Event {
        public VentilationOn(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... VentilationOn hardware code
            ventilation = true;
        }
        @Override public String toString() { return "Проветривание включено"; }
    }
    public class VentilationOff extends Event {
        public VentilationOff(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... VentilationOff hardware code
            ventilation = false;
        }
        @Override public String toString() { return "Проветривание выключено"; }
    }

    private String thermostat = "День";
    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... ThermostatNight hardware code
            thermostat = "Ночь";
        }
        @Override public String toString() { return "Термостат использует ночной режим"; }
    }
    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) { super(delayTime); }
        @Override public void action() {
            // ... ThermostatNight hardware code
            thermostat = "День";
        }
        @Override public String toString() { return "Термостат использует дневной режим"; }
    }

    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime); }
        @Override public void action() { addEvent(new Bell(delayTime)); }
        @Override public String toString() { return "Бам!"; }
    }

    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e : this.eventList)
                addEvent(e);
        }
        @Override public void action() {
            for(Event e : eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        @Override public String toString() { return "Перезапуск системы"; }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime); }
        @Override public void action() { System.exit(0); }
        @Override public String toString() { return "Отключение"; }
    }
}
