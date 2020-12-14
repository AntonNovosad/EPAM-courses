package basics;/*
Дан числовой ряд и некоторое число е.
Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
Общий член ряда имеет вид: a = 1/(2^n) + 1/(3^n)
 */

import java.util.Scanner;

public class CycleTask5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите некоторое е: ");
        double e = num.nextDouble();
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        System.out.println("Сумма членов ряда выше 'e' равна: " + sum);
    }
}
