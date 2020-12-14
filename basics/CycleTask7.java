package basics;

import java.util.Scanner;

public class CycleTask7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int m, n, a, a1;
        System.out.println("Введите начало промежутка: ");
        m = num.nextInt();
        System.out.println("Введите окончание промежутка: ");
        n = num.nextInt();
        for (int i = 1; i <= n; i++) {
            a = i % m;
            a1 = i % n;
            if (i == n || i == m || i == 1) {
                System.out.println();
            } else if (a == 0 || a1 == 0) {
                System.out.println(i);
            }
        }
    }
}
