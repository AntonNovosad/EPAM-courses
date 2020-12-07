/*
Вычислить значение функции: F(x) = x^2 - 3x + 9 , если x <=3;
                                   1/(x^3 + 6) , если x > 3;
 */

import java.util.Scanner;

public class BranchingTask5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();

        if (x <= 3){
            System.out.println(" Если х <= 3, F(x) = " + (Math.pow(x, 2) - 3 * x + 9));
        } else {
            System.out.println("Если х > 3, F(x) = " + (1/(Math.pow(x, 3) + 6)));
        }

    }
}
