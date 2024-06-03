package zadanie6;

public class z3 {
    public static void main(String[] args) {
        System.out.println(funk (4));
    }
    public static int funk (int N) {
        int s = 0;
        for (int i = 1; i <= N; i++) {
            s +=i;
        }
        return s;
    }

}
