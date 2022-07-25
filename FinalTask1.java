import java.text.DecimalFormat;
import java.util.Scanner;

public class FinalTask1 {

    public static void main(String[] args) {

        DecimalFormat format = new DecimalFormat("##.##");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара:");
        double doll = scanner.nextDouble();
        System.out.print("Количество рублей:");
        double rub = scanner.nextDouble();
        double convert = rub / doll;
        System.out.println("Итого: $ " + format.format(convert));

    }
}
