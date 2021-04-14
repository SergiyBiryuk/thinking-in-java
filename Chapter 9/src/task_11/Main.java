package task_11;

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

class StringConverter implements Processor  {
    public String name() { return getClass().getSimpleName(); }
    public String process(Object str) {
        char[] c = ((String)str).toCharArray();
        char q;
        for(int i = 0; i + 1 < c.length; i = i + 2){
            q = c[i]; c[i] = c[i+1]; c[i+1] = q;
        }
        return String.valueOf(c);
    }
}

public class Main {
    public static void main(String[] args) {
        Apply.process(new StringConverter(), "abcdefghij");
    }
}
