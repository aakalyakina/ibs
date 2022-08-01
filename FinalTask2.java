import java.util.Scanner;

public class FinalTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите простое уравнение из 5 символов, где вторым символом будет '+' или '-', а четвертым - '=' \n- Ввод: ");

        String str = sc.nextLine();
        int length = str.length();
        int resultPlus = str.indexOf("+");
        int resultMinus = str.indexOf("-");
        int resultEqually = str.indexOf("=");
        int xAvailability = str.indexOf("x");

        char sym1 = str.charAt(0);
        char sym3 = str.charAt(2);
        char sym5 = str.charAt(4);

        if (length != 5) {
            System.out.println("Выражение состоит не из 5 символов!");
        }
        else if (resultPlus != 1 && resultMinus != 1) {
            System.out.println("На втором месте не символы '+' или '-'");
        }
        else if (resultEqually != 3) {
            System.out.println("Символ '=' не на четвёртом месте");
        }
        else if (xAvailability == -1) {
            System.out.println("Пожалуйста, используйте 'х'");
        }

        else if (Character.isDigit(sym1) || 'x' == sym1 || Character.isDigit(sym3) || sym3 == 'x' || Character.isDigit(sym5) || sym5 == 'x')  {

        switch (str.charAt(1)) {
            case '+':
                if (str.charAt(0) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(2)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("- Вывод: " + (b - a));
                    break;
                }
                if (str.charAt(2) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("- Вывод: " + (b - a));
                    break;
                }
                if (str.charAt(4) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(2)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(0)));
                    System.out.println("- Вывод: " + (b + a));
                    break;
                }

            case '-':
                if (str.charAt(0) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(2)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("- Вывод: " + (b + a));
                    break;
                }
                if (str.charAt(2) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(4)));
                    System.out.println("- Вывод: " + (a - b));
                    break;
                }
                if (str.charAt(4) == 'x') {
                    int a = Integer.parseInt(String.valueOf(str.charAt(0)));
                    int b = Integer.parseInt(String.valueOf(str.charAt(2)));
                    System.out.println("- Вывод: " + (a - b));
                    break;
                }
        }
        }
    }
}
