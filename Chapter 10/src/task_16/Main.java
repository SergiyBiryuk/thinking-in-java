package task_16;

class Apply {
    public static void process(Processor p, Object o) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(o));
    }
}

interface Processor {
    String name();
    Object process(Object input);
}

interface ProcessorFactory {
    Processor getProcessor();
}

class StringProcessor implements Processor {

    private StringProcessor() { System.out.println("StringProcessor.StringProcessor()"); }

    @Override public String name() { return getClass().getSimpleName(); }

    @Override public Object process(Object str) {
        char[] c = ((String) str).toCharArray();
        char q;
        for (int i = 0; i + 1 < c.length; i = i + 2) {
            q = c[i];
            c[i] = c[i + 1];
            c[i + 1] = q;
        }
        return String.valueOf(c);
    }
    public static ProcessorFactory factory = new ProcessorFactory() {
        { System.out.println("Anonymous initialization"); }
        @Override public Processor getProcessor() { return new StringProcessor(); }
    };
}


public class Main {
    public static void main(String[] args) {
        Apply.process(StringProcessor.factory.getProcessor(), "abcdefghij");
    }
}
