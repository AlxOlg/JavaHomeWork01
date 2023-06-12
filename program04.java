package JavaHomeWork01;

/**
 * Проверить, является ли год високосным.
 */

import java.util.Scanner;

/**
 * program
 */
public class program04 {

    private static boolean isLeapYear(int year) {
        if (year % 400 == 0 || year % 100 != 0 & year % 4 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Год: ");       
        int year = scan.nextInt();
        scan.close();
        System.out.println(isLeapYear(year));
    }
}
