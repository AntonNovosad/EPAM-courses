/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */

package algorithms.multidimensional;

public class Multidimensional10 {
    public static void main(String[] args) {
        int sizeOfMatrix = MultidimensionalUtils.inputSquareMatrixSize();
        int[][] squareMatrix = new int[sizeOfMatrix][sizeOfMatrix];
        int max = 10;
        int min = -10;
        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                squareMatrix[i][j] = randomInt(max, min);
            }
        }
        System.out.println("Изначальная матрица: ");
        MultidimensionalUtils.printIntMatrix(squareMatrix);

        positiveDiagonal(squareMatrix);

    }

    private static void positiveDiagonal(int[][] matrix) {
        System.out.println("Положительные элементы главной диагонали матрицы: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }

    private static int randomInt(int max, int min) {
        double random = Math.random() * (max - min) + min;
        return (int) Math.round(random);
    }
}
