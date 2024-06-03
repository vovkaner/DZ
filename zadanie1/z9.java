package zadanie1;

public class z9 {
    public static void main(String[] args) {
        String s1 = "stroka lala";
        System.out.println(z9(s1, 'f'));
    }

    public static int z9(String s1, char b) {
        int k = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == b) {
                k = i;
                break;
            } else {
                System.out.println("Нет такого символа");
                break;
            }
        }
        return k;
    }

}
