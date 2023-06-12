package JavaHomeWork01;

/**
 * Задать целочисленный массив, состоящий из элементов 0 и 1.
 * С помощью цикла и условия заменить 0 на 1, 1 на 0.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * program
 */
public class program06 {

/**
 * Массив из случайных 0 и 1.
 */
    private static int[] createArray(int len) {
        int[] array = new int[len];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(2);;
        }
        return array;
    }

/**
 * Замена 0 на 1, 1 на 0.
 */
    private static void invertValue(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Длина массива: ");
        int lenArr = scan.nextInt();
        scan.close();
        int[] arr = createArray(lenArr);
        System.out.println(Arrays.toString(arr));
        invertValue(arr);
        System.out.println(Arrays.toString(arr));
    }
}
