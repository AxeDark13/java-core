import java.util.Scanner;

public class Switch {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        String age = scanner.nextLine();
        switch (age){
            case "ноль":
                System.out.println("Вы родились");
                break;
            case "семь":
                System.out.println("Вы пошли в школу");
                break;
            case "восемнадцать":
                System.out.println("Вы закончили школу");
                break;
        }
    }
}
