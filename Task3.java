/*
Вычислить значение выражения по формуле ( все переменные принимают действительные значения)
(sin(x) + cos(y))/(cos(x) - sin(y)) * tan(xy)
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double x, y, a, b;
        System.out.println("Введите значение х: ");
        x = num.nextDouble();
        System.out.println("Введите значение y: ");
        y = num.nextDouble();
        a = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)); // Перавя часть выражения
        b = Math.tan(x * y); // Вторая часть выражения
        System.out.format("Ответ %.5f", a * b);

    }
}
