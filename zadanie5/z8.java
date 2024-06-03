package zadanie5;

public class z8 {
    public static void main(String[] args) {
        System.out.println(simple (19));
    }
    public static boolean simple (int N) {
        int d = N;
        while (N > 2) {
            N--;
            if (d % N == 0) {
                return false;
            }
        }
        return true;
    }

}
