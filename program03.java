package JavaHomeWork01;

/**
 * Напечатать строку source repeat раз.
 */

import java.util.Scanner;

/**
 * program
 */
public class program03 {

    private static void printString(String source, int repeat) {
        for (int i = 1; i <= repeat; i++) {
            System.out.printf(source);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Строка: ");
        String source = scan.nextLine();
        System.out.printf("Количество: ");       
        int repeat = scan.nextInt();
        scan.close();
        printString(source, repeat);
    }
}
