import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Укажите размер массива: ");
        int size = input.nextInt();
        double array[] = new double[size];
        System.out.println("Укажите элементы массива:");
                for (double i = 0; i < size; i++) {
            array[(int) i] = input.nextInt();

        }

        System.out.println("Элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]);

        }
        double sum = 0;
        for (double i: array) {
            sum += i;
        }
        System.out.print("\n" + "Среднее арифметическое чисел равно: " + sum/array.length);

        for(double i=0; i<array.length; i++) {
            System.out.println("\n" +  array[(int) i]*sum/array.length);
        }

    }

}