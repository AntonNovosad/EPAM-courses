/*
Найдите наибольший элемент матрицы и замените все нечетные элементы на него.
 */

package algorithms.multidimensional;

public class Multidimensional15 {
    public static void main(String[] args) {
        int rowsQuantity = MultidimensionalUtils.inputMatrixRowsQuantity();
        int columnsQuantity = MultidimensionalUtils.inputMatrixColumnsQuantity();
        int[][] matrix = new int[rowsQuantity][columnsQuantity];
        int max = 15;
        int min = 0;
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                matrix[i][j] = randomInt(max, min);
            }
        }
        System.out.println("Изначальная матрица: ");
        MultidimensionalUtils.printIntMatrix(matrix);
        System.out.println();
        System.out.println("Максимальное значение матрицы: ");
        int maxValue = findMaxValue(matrix);
        System.out.println(maxValue);
        System.out.println();
        System.out.println("Матрица после выполнения условия: ");
        changeValues(matrix);
        MultidimensionalUtils.printIntMatrix(matrix);
    }

    private static void changeValues(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = findMaxValue(matrix);
                }
            }
        }
    }

    private static int findMaxValue(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    private static int randomInt(int max, int min) {
        double random = Math.random() * (max + min) - min;
        return (int) Math.round(random);
    }
}
