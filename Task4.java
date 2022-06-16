import java.io.IOException;
import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) throws IOException {
        Scanner num = new Scanner(System.in);

        System.out.println("Введите число x:");
        int x = num.nextInt();
        System.out.println("Число x: " + x);

        System.out.println("Введите число y:");
        int y = num.nextInt();
        System.out.println("Число y: " + y);

        System.out.println("Введите число z:");
        int z = num.nextInt();
        System.out.println("Число z: " + z);

        num.close();

        double num2 = ((x+y+z)/3.0);
        System.out.println("Среднее арифметическое: " + num2);

        double num3 = num2/2;
        System.out.println("Деление на 2 среднего арифметического: " + num3);

        double result = Math.floor(num3);
        System.out.println("Округление в меньшую сторону: " + result);

        if (result>3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
