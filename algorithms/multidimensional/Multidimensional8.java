/*
В числовой матрице поменять местами два любых столбца,
т.е. все элементы одного столбца поставить на соответствующие им позиции другого,
а его элементы второго переместить в первый.
Номера столбцов вводит пользователь с клавиатуры.
 */

package algorithms.multidimensional;

import java.util.Scanner;

public class Multidimensional8 {
    public static void main(String[] args) {
        int rowsQuantity = MultidimensionalUtils.inputMatrixRowsQuantity();
        int columnsQuantity = MultidimensionalUtils.inputMatrixColumnsQuantity();
        int[][] matrix = new int[rowsQuantity][columnsQuantity];
        int max = 10;
        int min = -10;
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                matrix[i][j] = randomInt(max, min);
            }
        }
        System.out.println("Изначальная матрица:");
        MultidimensionalUtils.printIntMatrix(matrix);
        System.out.println("Матрица после замены столбцов: ");
        changeColumnsMatrix(matrix);
        MultidimensionalUtils.printIntMatrix(matrix);
    }

    private static void changeColumnsMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер одного столбца, который хотите поменять: ");
        int column_1 = scanner.nextInt() - 1;
        System.out.println("Введите номер другого столбца, который хотите поменять местами : ");
        int column_2 = scanner.nextInt() - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == column_1) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][column_2];
                    matrix[i][column_2] = temp;
                }
            }
        }
    }


    private static int randomInt(int max, int min) {
        double random = Math.random() * (max - min) + min;
        return (int) Math.round(random);
    }
}
