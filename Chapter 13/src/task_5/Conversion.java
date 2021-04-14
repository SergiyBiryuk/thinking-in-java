package task_5;

import java.util.Formatter;

public class Conversion {
    public static void main(String[] args) {

        Formatter formatter = new Formatter(System.out);

        byte by = 100;
        short sh = 200;
        int i = 300;
        long l = 400L;
        char c = 'g';
        boolean b = Boolean.FALSE;
        String s = "qweqwe";
        float f = 321.0f;
        double d = 654.0;

        // %d %c %b %s %f %e %x %h
        formatter.format("%2$-10s %% %1$d %1$c %1$b %1$s %1$x %1$h %%\n", by, "BYTE");
        formatter.format("%2$-10s %% %1$d %1$c %1$b %1$s %1$x %1$h %%\n", sh, "SHORT");
        formatter.format("%2$-10s %% %1$d %1$c %1$b %1$s %1$x %1$h %%\n", i, "INTEGER");
        formatter.format("%2$-10s %% %1$d %1$b %1$s %1$x %1$h %%\n", l, "LONG");
        formatter.format("%2$-10s %% %1$c %1$b %1$s %1$h %%\n", c, "CHAR");
        formatter.format("%2$-10s %% %1$b %1$s %1$h %%\n", b, "BOOLEAN");
        formatter.format("%2$-10s %% %1$b %1$s %1$h %%\n", s, "STRING");
        formatter.format("%2$-10s %% %1$b %1$s %1$f %1$e %1$h %%\n", f, "FLOAT");
        formatter.format("%2$-10s %% %1$b %1$s %1$f %1$e %1$h %%\n", d, "DOUBLE");

    }
}
