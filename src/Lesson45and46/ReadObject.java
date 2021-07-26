package Lesson45and46;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:/_NOT_FOR_WORK_PROJECTS/people.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person[] people = (Person[]) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            for(Person person : people) {
                System.out.println(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
