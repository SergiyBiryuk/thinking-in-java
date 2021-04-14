package task_6;

public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot"; spot.says = "qwe";
        System.out.println("dog1: name = " + spot.name + "; says: " + spot.says);
        Dog scruffy = new Dog();
        scruffy.name = "scruffy"; scruffy.says = "asd";
        System.out.println("dog2: name = " + scruffy.name + "; says: " + scruffy.says);

        Dog bob = spot;

        System.out.println(bob == spot);
        System.out.println(bob.equals(spot));
    }
}
