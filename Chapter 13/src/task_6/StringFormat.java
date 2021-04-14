package task_6;

public class StringFormat {

    int i = 1;
    long l = 2L;
    float f = 3f;
    double d = 4.0;

    @Override public String toString() {
        return String.format("%05d %05d %05.2f %05.2f\n", i, l, f, d);
    }

    public static void main(String[] args) {
        StringFormat sf = new StringFormat();
        System.out.println(sf);
        System.out.println(sf);
    }
}
