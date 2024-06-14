package zadaniya_block1;

import java.util.Scanner;

public class day3_z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (true) {
            if (i == 5)
                break;
            i++;
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0)
                System.out.println("Деление на 0");
            System.out.println(a/b);
        }
    }

}
