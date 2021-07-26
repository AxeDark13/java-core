package Lesson32;

public class Test {
    public static void main(String[] args) {
        //Upcasting - Восходящее преобразование
        //Animal animal = new Dog();

        //Downcasting - Нисходящее преобразование
        //Dog dog2 = (Dog)animal;

        Animal a = new Animal();
        Dog dog = (Dog)a; //не безопасно
    }
}
