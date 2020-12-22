/*
Даны действительные числа A1, A2, ..., An.
Найти max(A1 + A2n,A2 + A2n-1,...,An + An+1)
 */

package algorithms.arrays;

public class Arrays7 {
    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double max;
        for (int i = 1; i < array.length; i++){
            max = Math.max(array[i]+array[2*i],array[i+1]+array[2*i-1]);
            System.out.println(max);
        }
    }
}

