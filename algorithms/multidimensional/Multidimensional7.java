package algorithms.multidimensional;

import java.util.Scanner;

public class Multidimensional7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер матрицы: ");
        int n = scanner.nextInt();
        solutionMultidimensional7(n);

    }

    private static void solutionMultidimensional7(int n) {
        double[][] array = new double[n][n];
        int plus = 0; // счетчик положительных элементов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.sin((i * i - j * j) / n);
                if (array[i][j] >= 0) {
                    plus++;
                }
            }
        }
        System.out.println("Колличество положительных элементов: " + plus);
    }
}
