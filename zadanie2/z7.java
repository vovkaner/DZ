package zadanie2;

public class z7 {
    public static void main(String[] args) {
        String s1 = "Siing la gf  la";
        System.out.println(z7(s1));
    }
    public static String z7 (String s){
        s = s.replaceAll(" ", "");
        return s;
    }

}
