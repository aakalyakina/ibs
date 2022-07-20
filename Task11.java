import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите первое число: ");
        Scanner sc1 = new Scanner(System.in);
        Integer s1 = sc1.nextInt();
        String string1 = Integer.toString(s1);
        System.out.println("Строковая переменная: " + string1);

        System.out.println("Введите второе число: ");
        Scanner sc2 = new Scanner(System.in);
        Integer s2 = sc2.nextInt();
        System.out.println("Целочисленная переменная: " + s2);

        if (s1 > s2)
        { System.out.println("Большее число: " + s1);
        Double s3 = s2.doubleValue();
        System.out.println("Меньшее число: " + s3);}
        else
        { System.out.println("Большее число: " + s2);
            Double s3 = s1.doubleValue();
            System.out.println("Меньшее число: " + s3);
        }
    }
}
