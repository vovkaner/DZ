package zadanie3;

public class z2 {
    public static void main(String[] args) {
        System.out.println(chet (4, 8));
    }

    public static int chet (int value1, int value2) {
        if (value1 > value2) {
            return value1;
        } else {
            return value2;
        }
    }

}
