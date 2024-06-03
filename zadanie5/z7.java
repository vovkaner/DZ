package zadanie5;

public class z7 {
    public static void main(String[] args) {
        Fib (500);
    }
    public static void Fib (int N) {
        int i1 = 0;
        int i2 = 1;
        int s = 1;
        System.out.print(i1 + ", " );
        while (s <= N) {
            System.out.print(s + ", ");
            s = i1+i2;
            i1 = i2;
            i2 = s;
        }
    } // можно ли короче написать?

}
