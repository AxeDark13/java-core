package Lesson42;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(2);

        System.out.println(animal1.equals(animal2));

        Animal animal3 = animal1;
        System.out.println(animal3 == animal1);

        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1 == string2); //wrong
        System.out.println(string1.equals(string2)); //ok

        String a = "Hello";
        String b = "Hello123".substring(0, 5);
        System.out.println(a == b); //false - wrong
        System.out.println(a.equals(b)); //true - ok
    }
}

class Animal {
    private int id;

    public Animal(int id) { this.id = id; }

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
