package zadanie6;

public class z9 {
    public static void main(String[] args) {
        funk (4);
    }
    public static void funk (int N) {
        for (int s = 1; s <= N; s++) {
            for (int i = 1; i <= N; i++) {
                System.out.print (i + " * " + s + " = " + s*i + "     ");
            }
            System.out.println();
        }

    }

}
