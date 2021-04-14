package task_8;

public class Splitting {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void main(String[] args) {
        String[] sArray = knights.split("the");
        for(String s : sArray)
            System.out.println(s);
    }
}
