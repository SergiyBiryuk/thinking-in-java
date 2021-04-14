package task_14;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Создаём " + this);
    }
    public void addRef() { refcount++; }
    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Disposing " + this);
    }
    @Override public String toString() { return "Shared " + id; }

    @Override
    protected void finalize() {
        if(refcount == 0) {
            System.out.println("Finalising Shared " + id);
        } else {
            System.out.println("!!! NO Finalising Shared " + id + " !!!");
            return;
        }
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Создаём " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
        shared = null;
    }
    @Override public String toString() { return "Composing " + id; }

    @Override
    protected void finalize() {
        if(shared == null) {
            System.out.println("Finalising Composing " + id);
        } else {
            System.out.println("!!! NO Finalising Composing " + id + " !!!");
            return;
        }
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared), new Composing(shared) };
        for(int i = 0; i < composing.length; i++) {
            composing[i].dispose();
            composing[i] = null;
                System.gc();
        }
        shared = null;
        System.gc();
    }
}
