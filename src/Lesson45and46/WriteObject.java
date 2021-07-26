package Lesson45and46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = { new Person(1, "Bob"), new Person(2, "Nike"), new Person(3, "Tom")};

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:/_NOT_FOR_WORK_PROJECTS/people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(people);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
