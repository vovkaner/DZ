package zadanie6;

public class z10 {
    public static void main(String[] args) {
        int N = 500;
        for (int i = 1; i < N; i++) if (funk(i) == true) System.out.print(i + ", ");


    }
    public static boolean funk (int N) {
        int value = N;
        int s = N;
        int k = 1;
        int s2 = 0;

        for (int j = 1; N / 10 > 0; j++){
            N /= 10;
            k++;
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
        if (s2 == s) return true;
        else return false;
    }

}
