package zadanie4;

public class z4 {
    public static void main(String[] args) {
        mark (6);
    }
    public static void mark (int oc) {
        switch (oc) {
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Это не оценка");
        }
    }

}
