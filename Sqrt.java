import java.util.Scanner;
public class Sqrt {
    public static int mySqrt(int x) {
    if (x >= 0)
    {
       return (int) Math.sqrt (x);
    }
    else {
        return 0;
    }
    }
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println (" Enter a positive number you wants the root of");
        System.out.println (mySqrt (sc.nextInt()));
    }
}