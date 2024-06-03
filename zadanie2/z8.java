package zadanie2;

public class z8 {
    public static void main(String[] args) {
        String s1 = "Siing la gf la";
        System.out.println(z8(s1));
    }
    public static int z8 (String s){
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') count++;
        }
        return count;
    }

}
