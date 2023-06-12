package JavaHomeWork01;

/**
 * Проверить, что число положительное.
 */

import java.util.Scanner;

/**
 * program
 */
public class program02 {

    private static boolean isPositive(int x) {
        if (x > 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Число: ");
        int num = scan.nextInt();
        scan.close();
        System.out.println(isPositive(num));
    }
}
