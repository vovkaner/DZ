package zadaniya_block1;

import java.util.Scanner;

public class day2_z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(y(x));
    }
    public static double y (double x) {
        if (x >= 5)
            return (x*x-10)/(x+7);
        else if (x > -3 && x < 5)
            return (x+3)/(x*x-2);
        else return 420;
    }

}
