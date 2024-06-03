package zadanie3;

public class z5 {
    public static void main(String[] args) {
        int year = 1900;
        if ((year % 400 == 0) || (year % 4 == 0) && !(year % 100 == 0)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }
}
