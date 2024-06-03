package zadanie2;

public class z5 {
    public static void main(String[] args) {
        String s1 = "Striiing lala";
        System.out.println(z5(s1));
    }
    public static int z5 (String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'y', 'а', 'е', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я' :
                    count++;
            }
        }
        return count;
    }

}
