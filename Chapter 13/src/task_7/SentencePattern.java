package task_7;

public class SentencePattern {
    public static void main(String[] args) {
        String str1 = "Hello World.";
        String str2 = "hello World.";
        String str3 = "Hello World!";
        String str4 = "hello World!";

        System.out.println(str1.matches("^\\p{javaUpperCase}.*\\.$"));
        System.out.println(str2.matches("^\\p{javaUpperCase}.*\\.$"));
        System.out.println(str3.matches("^\\p{javaUpperCase}.*\\.$"));
        System.out.println(str4.matches("^\\p{javaUpperCase}.*\\.$"));
    }
}
