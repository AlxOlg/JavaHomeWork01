package JavaHomeWork01;

/**
 * Вернуть массив длины len, каждое значение которого равно initialValue.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * program
 */
public class program05 {

    private static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Длина массива: ");
        int lenArr = scan.nextInt();
        System.out.printf("Значение элемента: ");
        int valArr = scan.nextInt();
        scan.close();
        int[] arr = createArray(lenArr, valArr);
        System.out.println(Arrays.toString(arr));
    }
}
