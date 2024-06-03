package zadanie3;

public class z9 {
    public static void main(String[] args) {
        time (11);
    }

    public static void time (int hour) {
        if (hour >= 6 & hour < 12) {
            System.out.println("Утро");
        }  else if (hour >= 12 & hour < 17){
            System.out.println("День");
        } else if (hour >= 17 & hour < 22){
            System.out.println("Вечер");
        } else if ((hour >= 22 & hour < 24) || (hour >= 0 & hour < 6)){
            System.out.println("Ночь");
        } else {
            System.out.println("Это не время");
        }

    }

}
