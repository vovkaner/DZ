package zadanie4;

public class z3 {
    public static void main(String[] args) {
        String s1 = "Январь";
        System.out.println(z3(s1));
    }
    public static int z3 (String s) {
        switch (s) {
            case "Январь":
                return 31;
            case "Февраль":
                return 29;
            case "Март":
                return 31;
            case "Апрель":
                return 30;
            case "Май":
                return 31;
            case "Июнь":
                return 30;
            case "Июль":
                return 31;
            case "Август":
                return 31;
            case "Сентябрь":
                return 30;
            case "Октябрь":
                return 31;
            case "Ноябрь":
                return 30;
            case "Декабрь":
                return 31;
            default:
                return 0;
        }
    }
}
