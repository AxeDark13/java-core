package Lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("test2");
        Scanner scanner = new Scanner(file);
        String input = scanner.nextLine();
        scanner.close();
        String[] numbersString = input.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));
    }
}
