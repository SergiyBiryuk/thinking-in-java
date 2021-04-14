package task_1;

public class First {
    public static Second s;

    public static void main(String[] args) {

        // ...some actions

        s = new Second();
        System.out.println(s);
        Second d = new Second(41);
        System.out.println(d);

        // ...other actions
    }
}

