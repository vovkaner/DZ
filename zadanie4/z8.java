package zadanie4;

public class z8 {
    public static void main(String[] args) {
        Num (-8);
    }

    public static void Num ( int value) {
        int znak;
        if (value == 0) {
            znak = 0;
        } else {
            znak = value / -value;
        }

        switch (znak) {

            case -1:
                System.out.println("Положительное число");
                break;
            case 1:
                System.out.println("Отрицательное число");
                break;

            case 0:
                System.out.println("Ноль");;
        }
    }

}
