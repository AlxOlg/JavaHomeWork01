package JavaHomeWork01;

/**
 * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] 
 * пройти по нему циклом, и числа меньшие 6 умножить на 2.
 */

import java.util.Arrays;

/**
 * program
 */
public class program07 {

    private static void changeValue(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }
}
