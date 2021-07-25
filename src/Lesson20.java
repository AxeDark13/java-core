public class Lesson20 {
    public static void main(String[] args) {
        Human_lesson20 h1 = new Human_lesson20("Bob", 40);
        System.out.println(h1);
    }
}
class Human_lesson20 {
    private String name;
    private int age;

    public Human_lesson20(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ", " + age;
    }
}