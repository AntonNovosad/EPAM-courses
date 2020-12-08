/*
Вывести на экран соответствие между символами и
их численными обозначениями в памяти компьютера.
 */

public class CycleTask6 {
    public static void main(String[] args) {
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
        System.out.println();
    }
}
