package zadanie5;

public class z6 {
    public static void main(String[] args) {
        System.out.println(fact (4));
    }
    public static int fact (int N) {
        int s = 1;
        while (N >= 1) {
            s *= N;
            N --;
        }
        return s;
    }

}
