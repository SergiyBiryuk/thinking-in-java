package task_4;

public class Constructor {
    Constructor() {
        System.out.println("This is default constructor!\n");
    }
    Constructor(String s) {
        System.out.println("This is another constructor!");
        System.out.println(s + '\n');
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        Constructor v = new Constructor("qweqweqwe");
    }
}
