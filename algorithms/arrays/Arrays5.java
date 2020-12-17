/*
Даны целые числа а1, а2,..., аn.
Вывести на печать только те числа, для которых ai > i.
 */

package algorithms.arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[] array = {4, 1, 6, 23, 5, 2};
        for(int i = 0; i < array.length; i++){
            if (array[i] > i){
                System.out.println(array[i]);
            }
        }
    }
}
