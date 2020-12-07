/*
Даны три точки A(x1, y1) , B(x2, y2), C(x3, y3).
Определить, будут ли они расположены на одной прямой.
 */
import java.util.Scanner;

public class BranchingTask3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3;
        System.out.println("Введите координату х1 для точки А");
        x1 = num.nextInt();
        System.out.println("Введите координату у1 для точки А");
        y1 = num.nextInt();
        System.out.println("Введите координату х2 для точки В");
        x2 = num.nextInt();
        System.out.println("Введите координату у2 для точки В");
        y2 = num.nextInt();
        System.out.println("Введите координату х3 для точки С");
        x3 = num.nextInt();
        System.out.println("Введите координату у3 для точки С");
        y3 = num.nextInt();

        if (x1 == x2 && x2 == x3) {
            System.out.println("Три точки расположены на одной прямой");
        } else if (y1 == y2 && y2 == y3) {
            System.out.println("Три точки расположены на одной прямой");
        } else if (x1 == y1 && x2 == y2 && x3 == y3) {
            System.out.println("Три точки расположены на одной прямой");
        } else {
            System.out.println("Три точки не расположены на одной прямой");
        }

    }
}
