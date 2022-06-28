import java.util.Arrays;
public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {

        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Массивы ч.2");

        System.out.println("Задача №1!");
        /*
        Посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».
        */
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i =0 ; i < arr.length; i++){
            sum += arr[i];
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        System.out.println();
        System.out.println("Задача №2!");

        /* Найти минимальную и максимальную трату за день
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат:
        «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей»
        */
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i]< minValue) {
            minValue = arr[i];
            minIndex = i;
            }
        }
        int maxValue = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length;i++){
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minValue + " рублей." + "Максимальная сумма трат" +
                " за день составила " + maxValue + " рублей.");
        System.out.println("Минимум было в " + minIndex + " день!" + "Максимум было в " + maxIndex + " день.");

        System.out.println();
        System.out.println("Задача №3!");

        /* Нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц,
        вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».*/

        double average = 0;
         for (int i = 0; i < arr.length;i++);
        average += sum/ arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + "рублей.");

        System.out.println();
        System.out.println("Задача №4!");
    }

}