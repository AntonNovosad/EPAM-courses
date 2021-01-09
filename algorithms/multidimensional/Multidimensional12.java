package algorithms.multidimensional;


public class Multidimensional12 {
    public static void main(String[] args) {
        int columnsQuantity = MultidimensionalUtils.inputMatrixColumnsQuantity();
        int rowsQuantity = MultidimensionalUtils.inputMatrixRowsQuantity();
        int[][] matrix = new int[columnsQuantity][rowsQuantity];
        int max = 10;
        int min = -10;
        for (int i = 0; i < columnsQuantity; i++) {
            for (int j = 0; j < rowsQuantity; j++) {
                matrix[i][j] = randomInt(max, min);
            }
        }
        System.out.println("Изначальная матрица: ");
        MultidimensionalUtils.printIntMatrix(matrix);
        sortBubbleMatrixSolution(matrix);
        System.out.println("Отсортированная матрица: ");
        MultidimensionalUtils.printIntMatrix(matrix);
    }


    private static void sortBubbleMatrixSolution(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int h = 0; h < matrix[i].length; h++) {
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
                    }
                }
            }
        }
    }
    private static void sortInsertionMatrixSolution(int[][] matrix) {
        int indexOfMax;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                indexOfMax = findIndexOfMax(j, matrix[i]);
                if (indexOfMax != j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][indexOfMax];
                    matrix[i][indexOfMax] = temp;
                }
            }
        }
    }

    private static int findIndexOfMax(int unsortedIndex, int[] array) {
        int indexOfMax = unsortedIndex;
        for (int j = unsortedIndex; j < array.length; j++) {
            if (array[j] > array[indexOfMax]) {
                indexOfMax = j;
            }
        }
        return indexOfMax;
    }

    private static int randomInt(int max, int min) {
        double random = Math.random() * (max - min) + min;
        return (int) Math.round(random);
    }

}
