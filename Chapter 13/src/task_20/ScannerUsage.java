package task_20;

import java.util.Scanner;

public class ScannerUsage {

    private int i;
    private long l;
    private float f;
    private double d;
    private String s;

    public ScannerUsage(String s) {
        this.s = s;
    }

    public void parse() {
        Scanner sc = new Scanner(s);
        i = sc.nextInt();
        l = sc.nextLong();
        f = sc.nextFloat();
        d = sc.nextDouble();
    }

    @Override public String toString() {
        return String.format("%d %d %.2f %.2f |===| %s\n", i, l, f, d, s);
    }

    public static void main(String[] args) {
        ScannerUsage su = new ScannerUsage("5 99999999 10,1 100,2");
        su.parse();
        System.out.println(su);
    }
}
