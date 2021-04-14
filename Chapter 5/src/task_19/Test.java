package task_19;

public class Test {

    static void qwe(String... args) {
        for (String s : args) System.out.print(s + ' ');
        System.out.println();
    }

    public static void main(String[] args) {
        qwe(new String[]{"asd", "qwe", "zxc"});
        qwe("xcv", "dfg", "rtyrty");
    }
}
