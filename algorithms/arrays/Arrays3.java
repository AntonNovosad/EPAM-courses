/*
Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

package algorithms.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        double[] array = {-2.0, 4.0, 6.0, -1.0, 0.0};
        int minus = 0;
        int plus = 0;
        int zero = 0;
        for (double v : array) {
            if (v > 0) {
                plus++;
            } else if (v < 0) {
                minus++;
            } else {
                zero++;
            }
        }
     System.out.println("Negative values: " + minus);
     System.out.println("Positive values: " + plus);
     System.out.println("Zero values: " + zero);
    }
}
