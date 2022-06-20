
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) throws Exception {

        System.out.println("Укажите количество строк: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Укажите количество столбцов: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Введите значение поля [%d][%d] ", r, c));

                int j = sc.nextInt();
                arr[r][c] = j;
            }
        }

        sc.close();

        for (int i = 0; i < arr[0].length; ++i) {
            System.out.print(arr[0][i] * 3 + " ");
        }
    }
}

