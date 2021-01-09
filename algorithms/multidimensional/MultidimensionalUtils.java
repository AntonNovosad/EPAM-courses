package algorithms.multidimensional;

import java.util.Scanner;

public class MultidimensionalUtils {

    public static int inputMatrixRowsQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк матрицы: ");
        return scanner.nextInt();
    }

    public static int inputMatrixColumnsQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во столбцов матрицы: ");
        return scanner.nextInt();
    }

    public static int inputSquareMatrixSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        return scanner.nextInt();
    }

    public static void printIntMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int rowLength = matrix[i].length;
            for (int j = 0; j < rowLength; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
