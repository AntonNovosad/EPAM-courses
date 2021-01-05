/*
Дана квадратная матрица.
Вывести на экран элементы, стоящие на диагонали.
 */

package algorithms.arrays;

import java.util.Scanner;

public class Multidimensional2 {
    public static void main(String[] args) {
        int[][] array;
        int n = 4; //высота матрицы
        int m = 4; //ширина матрицы
        Scanner num = new Scanner(System.in);
        array = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < m; j++) {
                array[i][j] = num.nextInt();
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (j == i){
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}
