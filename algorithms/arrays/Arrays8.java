/*
Дана последовательность целых чисел.
Образовать новую последовательность, выбросив из исходной члены, которые равны min.
 */

package algorithms.arrays;

import java.util.Arrays;

public class Arrays8 {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 4, 1, 7};
        int min = Integer.MAX_VALUE; //передаем максимаьное int-значение
        for (int i : array) {
            min = Math.min(min, i); // находим минимальное значение массива
        }
        int[] array2;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == min) {
                array2 = new int[array.length - 1];// создаем новый массив без min
                System.arraycopy(array, 0, array2, 0, j);
                System.arraycopy(array, j + 1, array2, j, array.length - j - 1);
                System.out.println(Arrays.toString(array2));
            }
        }

    }
}