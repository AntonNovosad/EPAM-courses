/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */

package algorithms.multidimensional;

public class Multidimensional13 {
    public static void main(String[] args) {
        int columnsQuantity = MultidimensionalUtils.inputMatrixColumnsQuantity();
        int rowsQuantity = MultidimensionalUtils.inputMatrixRowsQuantity();
        int[][] matrix = new int[rowsQuantity][columnsQuantity];
        int max = 10;
        int min = -10;
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                matrix[i][j] = randomInt(max, min);

            }
        }
        System.out.println("Изначальная матрица");
        MultidimensionalUtils.printIntMatrix(matrix);
        System.out.println("Сортировка столбцов матрицы по возрастанию:");
        sortBubbleMatrixAscendingSolution(matrix);
        MultidimensionalUtils.printIntMatrix(matrix);
        System.out.println("Сортировка столбцов матрицы по убыванию:");
        sortBubbleMatrixDescendingSolution(matrix);
        MultidimensionalUtils.printIntMatrix(matrix);
    }

    private static void sortBubbleMatrixAscendingSolution(int[][] matrix) {
        for (int h = 0; h < matrix.length; h++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > matrix[i + 1][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                    }
                }
            }
        }
    }

    private static void sortBubbleMatrixDescendingSolution(int[][] matrix) {
        for (int h = 0; h < matrix.length; h++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] < matrix[i + 1][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = temp;
                    }
                }
            }
        }
    }

    private static int randomInt(int max, int min) {
        double random = Math.random() * (max - min) + min;
        return (int) Math.round(random);
    }
}
