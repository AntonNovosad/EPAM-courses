/*
В массив А[N] занесены натуральные числа.
Найти сумму тех элементов, которые кратны данному К.
 */

package algorithms.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int K = 2;
        int sum = 0;
        int[] array = new int[]{4, 6, 7, 8};
        for (int j : array) {
            if (j % K == 0) {
                sum += j;
            }
        }
        System.out.println("The sum of the elements = " + sum);
    }
}
