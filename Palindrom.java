import java.util.Scanner;
public class Palindrom {
    public static boolean isPalindrome(int x)
     {
        int temp = x;
        int result = 0;
        while (temp >0)
        {
            result = (result*10) + (temp%10);
            temp /= 10;
        }
    if (result == x)
    {
        return true;
    } else {
        return false;   
    }

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a Number");
    int number = sc.nextInt();
        System.out.println(isPalindrome(number));
        sc.close(); 
    }
}
 


