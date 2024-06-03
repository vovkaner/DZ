package zadanie3;

public class z7 {
    public static void main(String[] args) {
        System.out.println(lock(485933));
    }

    public static boolean lock (int value1) {
        int parol = 48593;
        if (value1 == parol) {
            return true;
        }  else {
            return false;
        }
    }

}
