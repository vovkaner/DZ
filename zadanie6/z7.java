package zadanie6;

public class z7 {
    public static void main(String[] args) {
        funk (40);
    }
    public static void funk (int N) {
        int i1 = 0;
        int i2 = 1;
        System.out.print(i1 + ", ");
        for (int s = 1; s <= N; s = i1 + i2) {
            System.out.print(s + ", ");
            i1 = i2;
            i2 = s;
        }
    }

}
