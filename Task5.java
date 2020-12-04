/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
HHч ММмин SSc.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double T, Hh, Mm, Ss;
        System.out.println("Введите количество прошедшего времени в секундах:");
        T = num.nextDouble();
        Hh = (int) (T / 3600);
        Mm = (T / 3600 - Hh) * 60;
        Ss = (Mm - (int) Mm) * 60;

        System.out.println((int) Hh + "ч " + (int) Mm + "мин " + (int) Ss + "сек");

    }
}
