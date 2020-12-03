/*
 Найдите значение функции z = ((a - 3) * b / 2) + c
  */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c, z;
        System.out.println("Введите число a: ");
        a = num.nextInt();
        System.out.println("Введите число b: ");
        b = num.nextInt();
        System.out.println("Введите число c: ");
        c = num.nextInt();
        z = ((a - 3) * b / 2) + c;
        System.out.println("Ответ: z = " + z);
    }
}
