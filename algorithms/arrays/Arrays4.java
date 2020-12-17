/*
Даны действительные числа a1, a2, a,3, ..., an.
Поменять местами наибольший и наименьший элементы.
 */

package algorithms.arrays;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        double[] array = {4.0, 1.0, 3.0, 5.0, 2.0};
        double max = 0;
        double min = array[0];
        for (double i : array) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        for (int v = 0; v < array.length; v++) {
            if (array[v] == max) {
                array[v] = min;
            } else if (array[v] == min) {
                array[v] = max;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
