package zadanie4;

public class z6 {
    public static void main(String[] args) {
        char s1 = 'j';
        z6(s1);
    }
    public static void z6 (char b){
        switch (b) {
            case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z':
                System.out.println("Буква заглавная");
                break;
            default:
                System.out.println("Буква прописная");
        }
    }

}
