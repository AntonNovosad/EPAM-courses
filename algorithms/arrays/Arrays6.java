/*
Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

package algorithms.arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int sum = 0;
        double[] array = {1.0, 2.0, 5.0, 4.0, 8.0, 11.0};
        boolean b = true;
        for (int i = 2; i <= array.length; i++) {
            for (int P = 2; P < i; P++) {
                if (i % P == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                sum += array[i];
            } // Сумма значений простых числе i
            else b = true;
        }
        System.out.println(sum);
    }
}


