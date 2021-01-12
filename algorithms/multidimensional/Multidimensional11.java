/*
Матрицу 10х20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */


package algorithms.multidimensional;

public class Multidimensional11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        int max = 15;
        int min = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = randomInt(max, min);
            }
        }
        System.out.println("Изначальная матрица: ");
        MultidimensionalUtils.printIntMatrix(matrix);
        System.out.println();

        findIndexSameNumbers(matrix);
    }


    private static void findIndexSameNumbers(int[][] matrix) {
        int counter;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                counter = findSameNumbers(j, matrix[i]);
                if (counter >= 3) {
                    int index = i + 1;
                    System.out.println("В " + index + "-й строке выполняется условие");
                }
            }
        }
    }

    private static int findSameNumbers(int unsortedIndex, int[] array) {
        int counter = 0;
        for (int j = unsortedIndex; j < array.length; j++) {
            if (array[j] == 5) {
                counter++;
            }
        }
        return counter;
    }


    private static int randomInt(int max, int min) {
        double random = Math.random() * (max - min) + min;
        return (int) Math.round(random);
    }
}
