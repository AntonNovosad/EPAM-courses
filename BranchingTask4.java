/*
Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича.
Определить, пройдет ли кирпич через отверстие.
 */

import java.util.Scanner;

public class BranchingTask4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int A, B, x, y, z;
        x = 125; // ширина кирпича (мм)
        y = 250; // длина кирпича (мм)
        z = 65; // высота кирпича (мм)
        System.out.println("Задайте ширину отверстия: ");
        A = num.nextInt();
        System.out.println("Задайте высоту отверстия: ");
        B = num.nextInt();

        if (A >= x && B >= y || A >= y && B >= x) {
            System.out.println("Кирпич проходит через отверстие");
        } else if (A >= x && B >= z || A >= z && B >= x) {
            System.out.println("Кирпич проходит через отверстие");
        } else System.out.println("Кирпич НЕ проходит через отверстие");
    }
}
