import java.util.Scanner;

public class Submission {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return 1 + (num - 1) % 9;
        }
    }

    public static void main(String[] args) {
        Submission s = new Submission();
        System.out.println(s.addDigits(38));
        System.out.println(s.addDigits(111));
    }
}
