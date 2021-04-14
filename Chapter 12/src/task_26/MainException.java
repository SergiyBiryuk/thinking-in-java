package task_26;

import java.io.*;

public class MainException {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream("qwerty.asd");
        file.close();
    }
}
