package zadanie6;

public class z8 {
    public class Z6 {
        public static void main(String[] args) {
            System.out.println(funk(19));
        }

        public static boolean funk(int N) {

            for (int s = N - 1; s > 1; s--) {
                if (N % s == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
