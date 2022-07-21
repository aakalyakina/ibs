import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String string = "^[a-zA-Z]+$";
        System.out.println("Введите строку: ");
        String[] strArray = sc.nextLine().split(" ");
        int words = 0;
        for (String str : strArray) {
            if (str.matches(string)) {
                System.out.println(str);
                words++;
            }
        }
        System.out.println("Слова, состоящие только из латиницы: " + words);
    }
}

