package zadanie5;

public class z10 {
    public static void main(String[] args) {
        int N = 500;
        int i = 0;
        while (i <= N) {
            i++;
            if (table(i) == true) {
                System.out.print(i + ", ");
            }
        }

    }
    public static boolean table(int N) {
        int value = N;
        int k = 1;
        int s = N;
        int s2 = 0;

        while (N / 10 > 0) {
            if (N / 10 > 0) {
                N /= 10;
                k++;
            }
        }

        while (value  > 0) {

            int r = (value % 10);
            int s1 = r;
            for (int i = 1; i < k; i++) {
                s1 *= r;
            }
            value /= 10;
            s2 += s1;

        }
        if (s2 == s) {
            return true;
        } else {
            return false;
        }
    }

}
