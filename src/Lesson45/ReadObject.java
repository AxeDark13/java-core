package Lesson45;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:/_NOT_FOR_WORK_PROJECTS/people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 = (Person)objectInputStream.readObject();
            Person person2 = (Person)objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            System.out.println(person1);
            System.out.println(person2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
