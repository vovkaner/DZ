package zadanie2;

public class z6 {
    public static void main(String[] args) {
        String s1 = "Siing lala";
        System.out.println(z5(s1));
    }
    public static int z5 (String s){
        int countG = 0;
        int countS = 0;
        int count = s.length();
        //считаем гласные
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'y', 'а', 'е', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' :
                    countG++;
            }
        }
        // считаем все без пробелов
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') count --;
        }
        countS = count - countG;
        return countS;
    }

}
