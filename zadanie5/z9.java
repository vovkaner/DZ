package zadanie5;

public class z9 {
    public static void main(String[] args) {
        table(4);
    }
    public static void table(int N) {
        int i = 1;
        while (i <= N) {
            for (int j = 1; j <= N; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
            i++;
        }
    }

}
