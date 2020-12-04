/*
Дано действительное число R вида nnn.ddd ( три цифровых разряда в дробной и целой частях).
Поменять местами дробную и целую части числа и вывести полученное  значение числа.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double x, y;
        System.out.println("Введите дробное(nnn.ddd) значение x");
        x = num.nextDouble();
        y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println("Ответ: " + y);
    }
}
