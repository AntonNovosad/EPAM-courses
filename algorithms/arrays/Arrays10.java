/*
Дан целочисленный массив с количеством элементов n.
Сжать массив, выбросив из него каждый второй элемент(освободившиеся элементы заполнить нулями).
доп.масив не использовать.
 */

package algorithms.arrays;

import java.util.Arrays;

public class Arrays10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println();
        sortBubbleMatrixSolution(array);
        System.out.println("Получаемый массив по условию: ");
        System.out.println(Arrays.toString(array));
    }

    private static void sortBubbleMatrixSolution(int[] array) {
        findAndChangeValues(array);
        for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] == 0) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

    private static void findAndChangeValues (int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
    }
}
