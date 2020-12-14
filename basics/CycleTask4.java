package basics;/*
Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class CycleTask4 {
    public static void main(String[] args) {
        double Pr = 1.0;
        for (int i = 1; i <= 200; i++) {
            Pr *= Math.pow(i, 2);
        }
        System.out.println("Произведения квадратов первых двухсот чисел = " + Pr);
        // получается число намного больше размера "long"
    }

}
