package zadanie3;

public class z8 {
    public static void main(String[] args) {
        System.out.println(calc (5, 7, '*'));
    }

    public static double calc (double value1, double value2, char z) {
        if (z == '+') {
            return value1 + value2;
        }  else if (z == '-'){
            return value1 - value2;
        } else if (z == '*'){
            return value1 * value2;
        } else if (z == '/'){
            return value1 / value2;
        } else {
            return 0;
        }

    }

}
