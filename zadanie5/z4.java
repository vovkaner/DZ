package zadanie5;

public class z4 {
    public static void main(String[] args) {
        chet (23);
    }
    public static void chet (int N) {
        int i = 1;
        while (i <= N) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            i ++;
        }
    }

}
