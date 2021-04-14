package task_27;

import java.util.*;

class Command {
    private static int counter;
    private final String value = Integer.toString(counter++);
    public void operation() { System.out.print(value + " "); }
}

class QueueFiller {
    public void fill(Queue<Command> queue) {
        for (int i = 0; i < 20; i++) {
            queue.offer(new Command());
            System.out.print(queue.peek() + " ");
        }
        System.out.println();
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Queue<Command> queue = new LinkedList<Command>();
        QueueFiller filler = new QueueFiller();
        filler.fill(queue);
        while(queue.peek() != null)
            queue.poll().operation();
    }
}