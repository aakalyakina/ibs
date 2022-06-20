import java.util.Scanner;

public class Task7 {


    private static int i;

    public static void main(String[] args) {

        final int x = 18;
        final int y = 22;
        final int z = 35;


        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Укажите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Укажите элементы массива:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }


        System.out.println("Элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // Выводим на экран, полученный массив
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x || array[i] == y || array[i] == z){
                System.out.println(" \n Данное значение имеется в константах");
            break;
            }
        }
    }
}