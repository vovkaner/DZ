package zadanie2;

public class z10 {
    public static void main(String[] args) {
        String s1 = "SIINg la gf la";
        System.out.println(z10(s1));
    }
    public static String z10 (String s){
        for (int i = 0; i < s.length(); i++)
            s = s.toUpperCase();
        return s;
    }

}
