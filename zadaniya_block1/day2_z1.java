package zadaniya_block1;

import java.util.Scanner;

public class day2_z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        house (n);
    }
    public static void house (int n) {
        if (1 <= n && n <= 4)
            System.out.println("Малоэтажный дом");
        else if (5 <= n && n <= 8)
            System.out.println("Среднеэтажный дом");
        else if (n >= 9)
            System.out.println("Многоэтажный дом");
        else System.out.println("Ошибка ввода");
    }

}
