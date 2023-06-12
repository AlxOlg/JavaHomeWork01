package JavaHomeWork01;

/**
 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
 * (можно только одну из диагоналей, если обе сложно).
 */

import java.util.Scanner;
import java.util.Arrays;

/**
 * program
 */
public class program08 {

/**
 * Печать двумерного массива.
 */
    private static void printArray(int array[][]) {
        for (int[] item : array) {
            System.out.println(Arrays.toString(item));
        }
    }

/**
* Заполнение диагоналей "квадратного" массива единицами.
 */
    private static void fillDiagonal(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j | i == array.length - j - 1) array[i][j] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Размер массива: ");     
        int size = scan.nextInt();
        scan.close();
        int[][] arr = new int[size][size];
        fillDiagonal(arr);
        printArray(arr);
    }
}
