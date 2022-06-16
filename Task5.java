import java.io.IOException;
import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) throws IOException {

        double num1;
        double num2;
        double result;
        char operator;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        operator = reader.next().charAt(0);
        switch(operator) {
            case '+': result = num1 + num2;
                break;
            case '-': result = num1 - num2;
                break;
            case '*': result = num1 * num2;
                break;
            case '/': result = num1 / num2;
                break;
            default:  System.out.print("Вы ввели неправильный оператор");
                return;
        }
        System.out.print("Результат: " + num1 + " " + operator + " " + num2 + " = " + result);

    }
}
