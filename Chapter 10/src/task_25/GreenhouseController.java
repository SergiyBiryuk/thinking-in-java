package task_25;

public class GreenhouseController {
    public static void main(String[] args) {
        InhGreenhouseControls igc = new InhGreenhouseControls();
        igc.addEvent(igc.new Bell(900));
        Event[] eventList = {
                igc.new ThermostatNight(0),
                igc.new LightOn(200),
                igc.new LightOff(400),
                igc.new WaterOn(600),
                igc.new WaterOff(800),
                igc.new VentilationOn(1000),
                igc.new VentilationOff(1200),
                igc.new HumidifierOn(1300),
                igc.new HumidifierOff(1400),
                igc.new ThermostatDay(1500)
        };
        igc.addEvent(igc.new Restart(2000, eventList));
        if(args.length == 1)
            igc.addEvent(new GreenhouseControls.Terminate(Integer.parseInt(args[0])));
        igc.run();
    }
}
