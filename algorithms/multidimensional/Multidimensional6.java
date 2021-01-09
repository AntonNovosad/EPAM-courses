/*
Сформировать квадратную матрицу порядка N по заданному образцу(N - четное)
( 1, 1, 1,..., 1, 1, 1)
( 0, 1, 1,..., 1, 1, 0)
( 0, 0, 1,..., 1, 0, 0)
...
( 0, 1, 1,..., 1, 1, 0)
( 1, 1, 1,..., 1, 1, 1)
 */

package algorithms.multidimensional;

public class Multidimensional6 {
    public static void main(String[] args) {
        int n = MultidimensionalUtils.inputSquareMatrixSize();
        int[][] array = solutionMultidimensional6(n);
        MultidimensionalUtils.printIntMatrix(array);
    }

    private static int[][] solutionMultidimensional6(int n) {
        int[][] array = new int[n][n];
        int lastIndex = n - 1;
        int medium = n / 2;
        for (int i = 0; i < medium; i++) {
            for (int j = 0; j < medium; j++) {
                int value = decideQuarterValue(i, j);
                array[i][j] = value;
                array[i][lastIndex - j] = value;
                array[lastIndex - i][j] = value;
                array[lastIndex - i][lastIndex - j] = value;
            }
        }
        return array;
    }

    private static int decideQuarterValue(int row, int column) {
        if (row > column) {
            return 0;
        } else {
            return 1;
        }
    }
}
