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
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0)
                array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}