package task_24;

public class VampireNubers {
    public static void qwe(int i, int a, int b) {
        if(i == a * b) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        for(int i = 1001; i < 10000; i++) {
            String s = "";
            int j = i;
            while(j != 0) {
                s = (j % 10) + s;
                j /= 10;
            }

            char[] c = s.toCharArray();

            qwe(i, Integer.valueOf(String.valueOf(c[0])+String.valueOf(c[1])), Integer.valueOf(String.valueOf(c[2])+String.valueOf(c[3])));
            qwe(i, Integer.valueOf(String.valueOf(c[1])+String.valueOf(c[0])), Integer.valueOf(String.valueOf(c[3])+String.valueOf(c[2])));
            qwe(i, Integer.valueOf(String.valueOf(c[1])+String.valueOf(c[0])), Integer.valueOf(String.valueOf(c[2])+String.valueOf(c[3])));
            qwe(i, Integer.valueOf(String.valueOf(c[0])+String.valueOf(c[1])), Integer.valueOf(String.valueOf(c[3])+String.valueOf(c[2])));

            qwe(i, Integer.valueOf(String.valueOf(c[0])+String.valueOf(c[3])), Integer.valueOf(String.valueOf(c[1])+String.valueOf(c[2])));
            qwe(i, Integer.valueOf(String.valueOf(c[3])+String.valueOf(c[0])), Integer.valueOf(String.valueOf(c[2])+String.valueOf(c[1])));
            qwe(i, Integer.valueOf(String.valueOf(c[3])+String.valueOf(c[0])), Integer.valueOf(String.valueOf(c[1])+String.valueOf(c[2])));
            qwe(i, Integer.valueOf(String.valueOf(c[0])+String.valueOf(c[3])), Integer.valueOf(String.valueOf(c[2])+String.valueOf(c[1])));

            qwe(i, Integer.valueOf(String.valueOf(c[0])+String.valueOf(c[2])), Integer.valueOf(String.valueOf(c[1])+String.valueOf(c[3])));
            qwe(i, Integer.valueOf(String.valueOf(c[2])+String.valueOf(c[0])), Integer.valueOf(String.valueOf(c[3])+String.valueOf(c[1])));
            qwe(i, Integer.valueOf(String.valueOf(c[2])+String.valueOf(c[0])), Integer.valueOf(String.valueOf(c[1])+String.valueOf(c[3])));
            qwe(i, Integer.valueOf(String.valueOf(c[0])+String.valueOf(c[2])), Integer.valueOf(String.valueOf(c[3])+String.valueOf(c[1])));
        }
    }
}
