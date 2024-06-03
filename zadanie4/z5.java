package zadanie4;

public class z5 {
    public static void main(String[] args) {
        System.out.println(KvKub (6));
    }

    public static int KvKub (int value) {
        int ost = value % 2;
        switch (ost) {
            case 0:
                return value*value;
            default:
                return value*value*value;
        }
    }

}
