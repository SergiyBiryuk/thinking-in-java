package task_1;

import java.util.Random;

public class Second {
    private int id;
    public Second() {
        this.id = new Random().nextInt(100) + 1;
    }
    public Second(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "My id = " + id;
    }
}
