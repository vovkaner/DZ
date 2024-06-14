package zadaniya_block1;

import java.util.Scanner;

public class day2_z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        del5 (a,b);
    }
    public static void del5 (int a, int b) {
        if (a >=b)
            System.out.println("Некорректный ввод");
        for (int i = a+1; i < b; i++) {
            if (i % 10 == 5)
                System.out.print(i + " ");
        }
    }

}
