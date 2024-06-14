package zadaniya_block1;

import java.util.Scanner;

public class day3_z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0)
                break;
            System.out.println(a/b);


        }
    }

}
