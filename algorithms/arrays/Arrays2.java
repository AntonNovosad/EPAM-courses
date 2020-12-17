/*
Дана последовательность действительных чисел а1, а2, а3, ..., аn.
Заменить все ее члены, больше данного Z, этим числом.
Подсчитать кол-во замен.
 */

package algorithms.arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
            int Z = 3;
            int changes = 0;
            int[] array = new int[]{1, 2, 3, 4, 5, 6};
            for (int i = 0; i < array.length; i++){
                if(array[i] > Z){
                    array[i] = Z;
                    changes++;
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println("Number of changes = " + changes);
        }
    }