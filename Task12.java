import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) throws Exception {

        System.out.println("Введите строку \"I like Java!!!\":");
        String s = new Scanner(System.in).nextLine();

        boolean java = s.contains("Java");
        boolean starting = s.startsWith("I like");
        boolean ending = s.endsWith("!!!");
        System.out.println("Результат проверки подстроки: " + java);
        System.out.println("Результат проверки начала: " + starting);
        System.out.println("Результат проверки окончания: " + ending);

        if (java  && starting  && ending ) {
            String result = s.toUpperCase();
            System.out.println("Строка в верхнем регистре : " + result);
        }

        System.out.println("Подстрока с заменой символов: " + s.replaceAll("a", "o").substring(7, 11));
    }
}
