package task_10;

public class CharClass {
     public static void main(String[] args) {
         char[] c = new char[10];
         System.out.println("Superclass: " + c.getClass().getSuperclass().getCanonicalName());
         System.out.println("Is instance of Object: " + c instanceof Object);

    }
}
