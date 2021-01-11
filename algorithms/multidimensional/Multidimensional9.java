/*
Задана матрица неотрицательных чисел.
Посчитать сумму элементов в каждом столбце.
Определить, какой столбец содержит максимальную сумму.
 */

package algorithms.multidimensional;

public class Multidimensional9 {
    public static void main(String[] args) {
        int rowsQuantity = MultidimensionalUtils.inputMatrixRowsQuantity();
        int columnsQuantity = MultidimensionalUtils.inputMatrixColumnsQuantity();
        int[][] matrix = new int[rowsQuantity][columnsQuantity];
        int max = 10;
        int min = 0;
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                matrix[i][j] = randomInt(max, min);
            }
        }
        System.out.println("Изначальная матрица: ");
        MultidimensionalUtils.printIntMatrix(matrix);
        System.out.println();

        int[] sum = sumPositive(matrix);
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Сумма " + (i + 1) + "-го столбца = " + sum[i]);
        }

        System.out.println();
        System.out.println("Ответ");
        System.out.println("Столбец содержащий максимальную сумму:");
        findIndexOfMax(sum);


    }

    private static void findIndexOfMax(int[] sum) {
        int indexOfMax = 0;
        for (int j = indexOfMax; j < sum.length; j++) {
            if (sum[j] > sum[indexOfMax]) {
                indexOfMax = j;
            }
        }
        System.out.println(indexOfMax + 1);
    }

    private static int[] sumPositive(int[][] matrix) {
        int[] sum = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum[j] += matrix[i][j];
            }
        }
        return sum;
    }

    private static int randomInt(int max, int min) {
        double random = Math.random() * (max - min) + min;
        return (int) Math.round(random);
    }
}
