package task_2;

public class Test {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.f = 1.1f;
        tank2.f = 2.2f;
        System.out.println("1) tank1 = " + tank1.f + " tank2 = " + tank2.f);
        tank1 = tank2;
        System.out.println("2) tank1 = " + tank1.f + " tank2 = " + tank2.f);
        tank2.f = 3.3f;
        System.out.println("3) tank1 = " + tank1.f + " tank2 = " + tank2.f);
    }
}

class Tank {
    float f;
}
