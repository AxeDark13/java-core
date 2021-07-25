public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Роман", 50);

        String s1 = "Вова";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 20);

        person1.speak();
        person2.speak();
    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String user_name, int user_age) {
        name = user_name;
        age = user_age;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for(int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}
