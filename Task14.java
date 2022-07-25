public class Task14 {
    public static void main(String[] args) throws Exception {

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            int a = -20;
            int b = 20;
            array[i] = a + (int) (Math.random() * ((b - a) + 1));
            System.out.print(array[i] + "; ");
        }
        int maxElement = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= maxElement) {
                maxElement = array[j];
            }
        }
        System.out.println("\nМаксимальный элемент массива: " + maxElement);
        int minElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + minElement);

        int modulMax = Math.abs(maxElement);
        int modulMin = Math.abs(minElement);
        if (modulMax > modulMin) {
            System.out.println("Наибольшее значение по модулю: " + modulMax);
        }
        else {
            System.out.println("Наибольшее значение по модулю: " + modulMin);
        }
    }
}