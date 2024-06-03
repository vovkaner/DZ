package zadanie6;

public class z4 {
    public static void main(String[] args) {
        chet (23);
    }
    public static void chet (int N) {
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

}
