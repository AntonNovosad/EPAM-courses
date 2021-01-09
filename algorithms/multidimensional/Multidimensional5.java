/*
Сформировать квадратную матрицу порядка N по заданному образцу(N - четное)
( 1, 1, 1,..., 1, 1, 1)
( 2, 2, 2,..., 2, 2, 0)
( 3, 3, 3,..., 3, 0, 0)
...
(N-1,N-1,0,..., 0, 0, 0)
(N, 0, 0,..., 0, 0, 0)
 */

package algorithms.multidimensional;

import java.util.Scanner;

public class Multidimensional5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = scanner.nextInt();

        int[][] array = solutionMultidimensional5(n);

        MultidimensionalUtils.printIntMatrix(array);
    }

    private static int[][] solutionMultidimensional5(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                array[i][j] = i + 1;
                if (j >= n - i) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
