package Lesson35;

interface AbleToEat {
    public void eat();
}

class Animal implements AbleToEat {
    @Override
    public void eat() {
        System.out.println("afsdgsdgsd");
    }
}

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("gsgdsg");
            }
        };
        ableToEat.eat();
    }
}
