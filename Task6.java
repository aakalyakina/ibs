import java.io.IOException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws IOException {

        Scanner value = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        double x = value.nextDouble();
        if (x == 1) {
            System.out.println("Масса");

            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - пуд, 4 - фунт");
            double y = value.nextDouble();
            double grammMult = 1.0;
            double kgMult = 1.0;
            double pdMult = 1.0;
            double ftMult = 1.0;
            if (y == 1) {
                System.out.println("Грамм");
                kgMult = 0.001;
                pdMult = 0.000061;
                ftMult = 0.0024;
            }
            else if (y == 2) {
                System.out.println("Килограмм");
                grammMult = 1000;
                pdMult = 0.061;
                ftMult = 2.44;
            }
            else if (y == 3) {
                System.out.println("Пуд");
                grammMult = 16380;
                kgMult = 16.38;
                ftMult = 40;
            }
            else if (y == 4) {
                System.out.println("Фунт");
                grammMult = 409.5;
                kgMult = 0.41;
                pdMult = 0.025;
            }
            else {
                System.out.println("Вы ввели неверное значение");
            }

            System.out.println("Введите число");
            double num = value.nextDouble();
            System.out.println("Результат: ");

            double gr = num*grammMult;
            double kg = num*kgMult;
            double pud = num*pdMult;
            double ib = num*ftMult;

            System.out.println("Граммы: " + gr);
            System.out.println("Килограммы: " + kg);
            System.out.println("Пуды: " + pud);
            System.out.println("Фунты: " + ib);

        } else if (x == 2) {
            System.out.println("Расстояние");

            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            double y = value.nextDouble();
            double meterMult = 1.0;
            double mileMult = 1.0;
            double yardMult = 1.0;
            double footMult = 1.0;
            if (y == 1) {
                System.out.println("Метр");
                mileMult = 0.00062;
                yardMult = 1.09;
                footMult = 3.28;
            }
            else if (y == 2) {
                System.out.println("Миля");
                meterMult = 1609.34;
                yardMult = 1760;
                footMult = 5280;
            }
            else if (y == 3) {
                System.out.println("Ярд");
                meterMult = 0.91;
                mileMult = 0.00057;
                footMult = 3;
            }
            else if (y == 4) {
                System.out.println("Фут");
                meterMult = 0.3;
                mileMult = 0.00019;
                yardMult = 0.33;
            }
            else {
                System.out.println("Вы ввели неверное значение");
            }

            System.out.println("Введите число");
            double num = value.nextDouble();
            System.out.println("Результат: ");

            double meter = num*meterMult;
            double mile = num*mileMult;
            double yard = num*yardMult;
            double foot = num*footMult;

            System.out.println("Метры: " + meter);
            System.out.println("Мили: " + mile);
            System.out.println("Ярды: " + yard);
            System.out.println("Футы: " + foot);

                    }
        else {
            System.out.println("Вы ввели неверное значение");
        }


        value.close();


    }
}









