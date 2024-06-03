package zadanie4;

public class z9 {
    public static void main(String[] args) {
        Num (0);
    }

    public static void Num ( int value) {
        int chet = value % 2;

        switch (chet) {
            case 0:
                System.out.println("Четное число");
                break;
            case 1:
                System.out.println("Нечетное число");
                break;
        }
    }

}
