package Lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Exception in main method");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("C:/_NOT_FOR_WORK_PROJECTS/test.txt");
        Scanner scanner = new Scanner(file);
    }
}
