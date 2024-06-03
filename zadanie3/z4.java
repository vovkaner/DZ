package zadanie3;

public class z4 {
    public static void main(String[] args) {
        mark(5);
    }

    public static void mark (int value1) {
        if (value1 == 2) {
            System.out.println("Неудовлетворительно");;
        } else if (value1 == 3){
            System.out.println("Удовлетворительно");
        } else if (value1 == 4){
            System.out.println("Хорошо");
        } else if (value1 == 5){
            System.out.println("Отлично");
        } else {
            System.out.println("Это не оценка");
        }
    }

}
