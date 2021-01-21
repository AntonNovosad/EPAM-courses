/*
Сортировка выбором.
Дана последовательность чисел.
Требуется переставить элементы так, чтобы они были расположены по убыванию.
Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
а первый - на место наибольшего.
Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором.
 */

package algorithms.sorting;

import java.util.Arrays;

public class Sorting3 {
    public static void main(String[] args) {
        int[] array = new int[8];
        int maxValue = 10;
        int minValue = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt(maxValue, minValue);
        }
        System.out.println("Изначальная матрица:");
        System.out.println(Arrays.toString(array));
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int temp;
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
            temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
        System.out.println("Сортировка выбором:");
        System.out.println(Arrays.toString(array));
    }

    private static int randomInt(int max, int min) {
        double random = Math.random() * (max - min) + min;
        return (int) Math.round(random);
    }
}
