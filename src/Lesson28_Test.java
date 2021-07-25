import Package1.Person;

public class Lesson28_Test {
    private int id;

    public static void maint(String[] args){
        //public, private, default (доступно в пределах пакета), protected (доступны
        //в пределах одного пкета, доступно всем подклассам, даже если эти подклассы вне пакета

        Person person1 = new Person();
        //person1.name = "Bob" - error;
    }
}

class Test2 {

}