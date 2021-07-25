public class Lesson20 {
    public static void main(String[] args) {
        Human_lesson20 h1 = new Human_lesson20("Bob", 40);
        Human_lesson20 h2 = new Human_lesson20("Tom", 30);

        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human_lesson20 h3 = new Human_lesson20("Bob", 50);
        h3.printNumberOfPeople();
    }
}
class Human_lesson20 {
    private String name;
    private int age;
    public static int countPeople;

    public Human_lesson20(String name, int age) {
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) { this.name = name;  }
    public void setAge(int age) { this.age = age; }
    public void printNumberOfPeople() { System.out.println("Number of people is " + countPeople); };
}