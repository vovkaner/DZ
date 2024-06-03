package zadanie2;

public class z9 {
    public static void main(String[] args) {
        String s1 = "SIINg la gf la";
        System.out.println(z9(s1));
    }
    public static String z9 (String s){
        for (int i = 0; i < s.length(); i++)
            s = s.toLowerCase();
        return s;
    }

}
