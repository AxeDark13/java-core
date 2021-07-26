package Lesson47;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Mike");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:/All/Desktop/Program/test.bin"));) {
            objectOutputStream.writeObject(person1);
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }
}
