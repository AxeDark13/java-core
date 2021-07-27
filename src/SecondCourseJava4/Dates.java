package SecondCourseJava4;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis());

        date2.setTime(System.currentTimeMillis());

        System.out.println(date1);
        System.out.println("Время в миллисекундах: " + date1.getTime());
        System.out.println("Сравнение: " + date1.after(date2));
        System.out.println("Ещё сравние: " + (date1.compareTo(date2) > 0));
    }
}
