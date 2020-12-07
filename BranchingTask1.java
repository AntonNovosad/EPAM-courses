/*
Даны два угла треугольника ( в градусах). Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным.
 */

import java.util.Scanner;

public class BranchingTask1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите значение угла а (в градусах): ");
        a = num.nextInt();
        System.out.println("Введите значение угла b (в градусах): ");
        b = num.nextInt();
        c = 180 - a - b;
        if (c <= 0 || a == 0 || b == 0) {
            System.out.println("Ваша фигура не может быть треугольником");
        } else {
            System.out.println("Ваша фигура - треугольник");
        }

        if (a == 90 && b < 90 && c < 90) {
            System.out.println("Ваш треугольник - прямоугольный");
        } else if (b == 90 && a < 90 && c < 90) {
            System.out.println("Ваш треугольник - прямоугольный");
        } else if (c == 90 && a < 90 && b < 90) {
            System.out.println("Ваш треугольник - прямоугольный");
        }

    }
}
