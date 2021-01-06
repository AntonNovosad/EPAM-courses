/*
Сформировать квадратную матрицу порядка N по заданному образцу(N - четное)
( 1, 2, 3,..., N)
(N,N-1,N-2,...,1)
( 1, 2, 3,..., N)
(N,N-1,N-2,...,1)
...
(N,N-1,N-2,...,1)
 */

package algorithms.arrays;

import java.util.Scanner;

public class Multidimensional4 {
    public static void main(String[] args) {
        int n;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        array = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = j + 1;
                    System.out.print(array[i][j] + "  ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    array[i][j] = j + 1;
                    System.out.print(array[i][j] + "  ");
                }
            }
        }
    }
}
