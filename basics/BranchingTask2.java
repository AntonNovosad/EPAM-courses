package basics;/*
Найти max {min(a, b), min(c,d)}
 */

import java.util.Scanner;

public class BranchingTask2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Введите значение а: ");
        a = num.nextInt();
        System.out.println("Введите значение b: ");
        b = num.nextInt();
        System.out.println("Введите значение c: ");
        c = num.nextInt();
        System.out.println("Введите значение d: ");
        d = num.nextInt();
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);
        System.out.println("Максимальное значение: " + Math.max(min1, min2));
    }
}
