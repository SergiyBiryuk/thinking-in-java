package task_4;

class Speed {
    static float speed(float distance, float time) {
        return distance / time;
    }
}

public class Test {
    public static void main(String[] args) {
        float distance = 100,
              time = 20,
              speed = Speed.speed(distance, time);
        System.out.println(speed);
    }
}
