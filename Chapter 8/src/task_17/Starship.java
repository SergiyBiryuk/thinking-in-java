package task_17;

class AlertStatus {
    @Override
    public String toString() {
        return "NO AlertStatus";
    }
}
class GreenAlertStatus extends AlertStatus {
    @Override
    public String toString() {
        return "GREEN_AlertStatus";
    }
}
class YellowAlertStatus extends AlertStatus {
    @Override
    public String toString() {
        return "YELLOW_AlertStatus";
    }
}
class RedAlertStatus extends AlertStatus {
    @Override
    public String toString() {
        return "RED_AlertStatus";
    }
}
class Regulator {
    private AlertStatus status = new AlertStatus();
    public void setGreenStatus() { status = new GreenAlertStatus(); }
    public void setYellowStatus() {status = new YellowAlertStatus(); }
    public void setRedStatus() {status = new RedAlertStatus(); }
    public void getStatus() { System.out.println(status); }
}

public class Starship {
    public static void main(String[] args) {

        Regulator regulator = new Regulator();
        regulator.getStatus();

        regulator.setGreenStatus();
        regulator.getStatus();

        regulator.setYellowStatus();
        regulator.getStatus();

        regulator.setRedStatus();
        regulator.getStatus();
    }
}


