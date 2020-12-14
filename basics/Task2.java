package basics;/*
Вычислить значение выражения по формуле( все переменные принимают действительные значения)
 (b + sqrt(b^2 + 4ac))/2a - a^3 * c + b^(-2)
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a, b, c, x, y, z;
        System.out.println("Введите значение а: ");
        a = num.nextDouble();
        System.out.println("Введите значение b: ");
        b = num.nextDouble();
        System.out.println("Введите значение c: ");
        c = num.nextDouble();
        x = (b + Math.pow(b * b + 4 * a * c, 0.5)) / (2 * a); // Первая часть выражения
        y = Math.pow(a, 3) * c + Math.pow(b, -2); // Вторая часть выражения
        z = x - y; // Основное выражение задания
        System.out.println("Ответ: " + z);
    }
}
