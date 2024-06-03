package zadanie5;

public class z3 {
    public static void main(String[] args) {
        System.out.println(summ (4));
    }
    public static int summ (int N) {
        int s = 0;
        while (N >= 1) {
            s += N;
            N --;
        }
        return s;
    }

}
