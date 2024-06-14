package zadaniya_block1;

import java.util.Scanner;

public class day2_z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        del5 (a,b);
    }
    public static void del5 (int a, int b) {
        if (a >=b)
            System.out.println("Некорректный ввод");

        while (a < b-1) {
            a++;
            if (a % 10 == 5)
                System.out.print(a + " ");
        }
    }

}
