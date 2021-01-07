/*
Дана квадратная матрица.
Вывести на экран элементы, стоящие на диагонали.
 */

package algorithms.arrays;

import java.util.Scanner;

public class Multidimensional2 {
    public static void main(String[] args) {
        int[][] array;
        Scanner num = new Scanner(System.in);
        array = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "-я строка матрицы: ");
            for (int j = 0; j < 4; j++) {
                array[i][j] = num.nextInt();
            }
        }
//        for (int i = 0; i < 4; i++){
//            for (int j = 0; j < 4; j++){
//                if (j == i){
//                    System.out.print(array[i][j]);
//                }
//            }
//        }
        for (int i = 0; i < 4; i++){
            System.out.print(array[i][i] + " ");
        }
    }
}
