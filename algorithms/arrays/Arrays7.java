/*
Даны действительные числа A1, A2, ..., An.
Найти max(A[1] + A[2n],A[2] + A[2n-1],...,A[n] + A[n+1])
 */

package algorithms.arrays;

import java.util.Arrays;

public class Arrays7 {
    public static void main(String[] args) {
        int n = 5;
        double[] array = new double[2 * n];
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
        }
        for (int j = 0; j < n; j++) {
            if (array[j] + array[(2 * n - 1) - j] > max) {
                max = array[j] + array[(2 * n - 1) - j]; // максимум
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Максимально число последовательности = " + max);
    }
}


