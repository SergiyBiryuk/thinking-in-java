package task_4.pack;

public class Human {
    public Human() {
        System.out.println("Human constructor.");
    }
    public void action() {
        Car car = new Car();
        car.drive();
    }
}
