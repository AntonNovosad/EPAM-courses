/*
Дана матрица.
Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

package algorithms.multidimensional;

import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        int[][] array;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите высоту матрицы: ");
        int n = num.nextInt();
        System.out.println("Введите ширину матрицы: ");
        int m = num.nextInt();
        array = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < m; j++) {
                array[i][j] = num.nextInt();
            }
        }

        System.out.println("Столбцы матрицы по условию: ");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j += 2) {
                if (array[0][j] > array[n - 1][j]) {
                    System.out.print(array[i][j] + "\t");

                }
            }
        }
    }
}
