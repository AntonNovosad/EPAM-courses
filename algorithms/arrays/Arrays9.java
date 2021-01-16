/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */

package algorithms.arrays;

public class Arrays9 {
    public static void main(String[] args) {
        int maxValue = 10;
        int minValue = 0;
        int[] array = new int[10];
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt(maxValue, minValue);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Ответ по условию: ");
        MostPopularValue(array);
    }

    public static void MostPopularValue(int[] array) {
        int[] popularValue = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popularValue[i]++;
                }
            }
        }

        int valueResult = array[0];
        int popularValueResult = popularValue[0];
        for (int i = 0; i < popularValue.length; i++) {
            if (popularValue[i] > popularValueResult) {
                popularValueResult = popularValue[i];
                valueResult = array[i];
            }
            if ((popularValueResult == popularValue[i]) && (array[i] < valueResult)) {
                valueResult = array[i];
            }
        }
        System.out.println(valueResult);
    }

    private static int randomInt(int max, int min) {
        double random = Math.random() * (max - min) + min;
        return (int) Math.round(random);
    }
}
