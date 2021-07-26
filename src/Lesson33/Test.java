package Lesson33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //////////////// Java 5 ////////////////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal); //String s = (String) animals.get(3) - error

        String animal1 = (String)animals.get(1);
        System.out.println(animal1);

        //////////////////// generics are released ///////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);

        //////////////////// Java 7 /////////////////////

        List<String> animals3 = new ArrayList<>();

        //animals3.add(new Animal()); - error
    }
}

class Animal {

}
