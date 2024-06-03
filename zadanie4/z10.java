package zadanie4;

public class z10 {
    public static void main(String[] args) {
        word('р');
    }
    public static void word (char b) {
        switch (b) {
            case 'a', 'e', 'i', 'o', 'u', 'y', 'а','е','и','о','у','ы','э','ю','я':
                System.out.println("Гласная");
                break;
            default:
                System.out.println("Согласная");
        }
    }

}
