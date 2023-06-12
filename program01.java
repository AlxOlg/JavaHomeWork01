package JavaHomeWork01;
/**
 * Написать метод, принимающий на вход два целых числа и проверяющий, 
 * что их сумма лежит в пределах от 10 до 20 (включительно), 
 * если да – вернуть true, в противном случае – false.
 */

import java.util.Scanner;

/**
 * program
 */
public class program01 {

    private static boolean isSumBetween10And20(int a, int b) {
        int min = 10;
        int max = 20;
        int sum = a + b;
        if (sum >= min && sum <= max) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Первое число: ");
        int num1 = scan.nextInt();
        System.out.printf("Второе число: ");       
        int num2 = scan.nextInt();
        scan.close();
        System.out.println(isSumBetween10And20(num1, num2));
    }
}
