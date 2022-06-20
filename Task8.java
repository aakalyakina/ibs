import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        int maxNum, sum, i;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите целое положительное число: ");
        maxNum = input.nextInt();

        sum = 0;

        for (i = 1; i < maxNum; i+=2)
        {
            sum += i;
        }

        System.out.println("\n" + "Сумма нечетных чисел от 1 до " + maxNum + " равна: " + sum);
    }

    }
