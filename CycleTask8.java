/*
Даны два числа.
Определить цифры, входящие в запись как первого так и второго числа.
 */

import java.util.ArrayList;

public class CycleTask8 {
    public static void main(String[] args) {
        int a = 34646, b = 45747;
        System.out.println("Цифры которые входят в число a: " + numberEnter(a));
        System.out.println("Цифры которые входят в число b: " + numberEnter(b));
    }

    public static ArrayList numberEnter(int a) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (a > 0) {
            int i = 0;
            array.add(i, a % 10);
            a = a / 10;
            i++;
        }
        return array;
    }
}
