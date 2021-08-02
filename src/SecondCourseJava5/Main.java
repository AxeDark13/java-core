package SecondCourseJava5;

import java.util.ArrayList;

public class Main {

    static class Fruit {
        int weight;
    }

    static class Citrus extends Fruit {
        int weight;
    }

    static class Orange extends Citrus {
        int color;
    }

    static class BigRoundOrange extends Orange {
        int size = 100;
    }

    private  static int totalWeight(ArrayList<? extends Citrus> oranges) {
        int weight = 0;
        for(int i = 0; i < oranges.size(); i++) {
            weight += oranges.get(i).weight;
        }
        Fruit fruit = oranges.get(0);
        //oranges.add(new Citrus()); => error
        return weight;
    }

    private static void addOrange(ArrayList<? super Orange> oranges) {
        for(int i = 0; i < 10; i++) {
            oranges.add(new Orange());
        }
        //Citrus citrus = oranges.get(0); => error
        Object object = oranges.get(0); //ok
        oranges.add(new BigRoundOrange());
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();

        citrus = orange;
        fruit = citrus;
        fruit = orange;

        //citrus = fruit; => error
        //orange = citrus; => error

        ArrayList<Citrus> citrusList = new ArrayList();
        fruit = citrusList.get(0);
        citrus = citrusList.get(0);
        //orange = citrusList.get(0); => error

        ArrayList<Orange> orangesList = new ArrayList<>();

        //citrusList = orangesList; => error

        totalWeight(orangesList);
        totalWeight(citrusList);

        addOrange(orangesList);
        addOrange(citrusList);
    }
}
