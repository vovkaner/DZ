package zadanie1;

public class z6 {
    public static void main(String[] args) {
        String s1 = "stroka lala";
        System.out.println(z6(s1, 'a'));
    }
    public static int z6 (String s1, char b) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++)
            if (b == s1.charAt(i)) count++;
        return count;
    }

}
