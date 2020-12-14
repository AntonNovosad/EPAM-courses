package basics;/*
Вычислить значение функции на отрезке [a, b] с шагом h
 */

public class CycleTask2 {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 5;
        double h = 0.5; // шаг
        double y;

        for (double i = a; i <= b; i += h) { // i это х
            if (i > 2) {
                y = i;
                System.out.println("Значение функции = " + y);
            } else if (i <= 2) {
                y = -i;
                System.out.println("Значение функции = " + y);
            }
        }
    }
}
