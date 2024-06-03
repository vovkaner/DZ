package zadanie2;

public class z4 {
    public static void main(String[] args) {
        String s1 = "alal sa lala";
        System.out.println(z4(s1));
    }
    public static boolean z4 (String s){
        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                result = false;
                break;
            } else result = true;
        }
        return result;
    }

}
