package Lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/_NOT_FOR_WORK_PROJECTS/test.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Hello");
        pw.close();
    }
}
