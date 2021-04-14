package task_30;

import java.util.NoSuchElementException;
import java.util.Random;

class Annoyance extends RuntimeException {
    public Annoyance(String msg) { super(msg); }
}
class Sneeze extends Annoyance {
    public Sneeze(String msg) { super(msg); }
}

public class Human {
    private static Random rand = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            try {
                try {
                    switch (rand.nextInt(3)) {
                        default: throw new NoSuchElementException("NOSUCHELEMENT");
                        case 0:
                            throw new Sneeze("SNEEZE");
                        case 1:
                            throw new Annoyance("ANNOYANCE");
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (RuntimeException e) {
                try {
                    throw (Exception)e.getCause();
                } catch (Sneeze inE) {
                    System.out.println("Sneeze exception:");
                    inE.printStackTrace(System.out);
                } catch (Annoyance inE) {
                    System.out.println("Annoyance exception:");
                    inE.printStackTrace(System.out);
                } catch (Exception inE) {
                    System.out.println("Exception:");
                    inE.printStackTrace(System.out);
                }
            }
        }
    }
}