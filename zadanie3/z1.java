package zadanie3;

public class z1 {
    public static void main(String[] args) {
        System.out.println(chet (4));
    }

    public static boolean chet (int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
