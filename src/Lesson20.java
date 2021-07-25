public class Lesson20 {
    public static void main(String[] args) {
        Human_lesson20 human1 = new Human_lesson20();
    }
}
class Human_lesson20 {
    private String name;
    private int age;

    public Human_lesson20() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }
    public Human_lesson20(String name) {
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }
    public Human_lesson20(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name;  }
    public void setAge(int age) { this.age = age; }
}