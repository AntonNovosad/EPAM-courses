package basics;/*
Задача 6 ( ЛИнейные программы):
Составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежитзакрашенной области, и false - в противном случае.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x, y;
        System.out.println("Введите координату х:");
        x = num.nextInt();
        System.out.println("Введите координату у:");
        y = num.nextInt();
        if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println(true);
        } else System.out.println(x >= -2 && x <= 2 && y >= 0 && y <= 4);
    }
}
