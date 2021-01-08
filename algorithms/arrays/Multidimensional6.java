/*
Сформировать квадратную матрицу порядка N по заданному образцу(N - четное)
( 1, 1, 1,..., 1, 1, 1)
( 0, 1, 1,..., 1, 1, 0)
( 0, 0, 1,..., 1, 0, 0)
...
( 0, 1, 1,..., 1, 1, 0)
( 1, 1, 1,..., 1, 1, 1)
 */

package algorithms.arrays;

import java.util.Scanner;

public class Multidimensional6 {
    public static void main(String[] args) {
        int n;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        n = scanner.nextInt();
        array = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){

            }
        }
    }
}
