package task_23;

import java.util.Random;

class ConstructorException extends Exception {}

class DisposeClass {
    private static long counter;
    private final long id = counter++;
    public void dispose() {
        System.out.println("DisposeClass ID = " + id + "; disposing");
    }
}

public class FailingConstructor {
    private DisposeClass dc;
    Random rand = new Random();
    public FailingConstructor() throws ConstructorException {
        dc = new DisposeClass();
        try {
            if (rand.nextInt(2) == 1)
                throw new ConstructorException();
            DisposeClass dc2 = new DisposeClass();
            try {
            } finally {
                dc2.dispose();
                dc2 = null;
            }
        } finally {
            dc.dispose();
            dc = null;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            try {
                System.out.println("\tIteration " + i + ": ==================");
                FailingConstructor o = new FailingConstructor();
                // do something
            } catch (ConstructorException e) {
                e.printStackTrace(System.out);
            }
    }
}
