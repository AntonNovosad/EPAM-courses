/*
Дана матрица.
Вывести k-ю строку и p-й столбец матрицы.
 */

package algorithms.multidimensional;

import java.util.Scanner;

public class Multidimensional3 {
    public static void main(String[] args) {
        int[][] array = new int[4][5];
        int k; // строка
        int p; // столбец
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < 5; j++) {
                array[i][j] = scanner.nextInt(); // задаем значения матрицы
            }
        }
        System.out.println("Введите номер строки в рамках матрицы: ");
        k = scanner.nextInt();
        System.out.println("Введите номер столбца в рамках матрицы:");
        p = scanner.nextInt();
        // ответ
        System.out.println("Вывод заданной строки матрицы: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[k - 1][i] + "\t"); //вывод заданной строки
        }
        System.out.println();
        System.out.println("Вывод заданного столбца матрицы: ");
        for (int j = 0; j < 4; j++) {
            System.out.println(array[j][p - 1]); //вывод заданного столбца
        }
    }
}
