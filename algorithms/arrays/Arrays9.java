/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */

package algorithms.arrays;

public class Arrays9 {
    public static void main(String[] args) {
        boolean b = true;
        int[] array = {1, 2, 5, 3, 4, 7, 2, 3, 9};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[i] == array[j]) {    // сравнение значений в массиве
                    System.out.println("Одинаковое число: " + array[i]);
                }
        }
    }
}
