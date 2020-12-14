/*
Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class CycleTask1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите любое положительное число: ");
        int a = num.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел = " + sum);
    }
}
