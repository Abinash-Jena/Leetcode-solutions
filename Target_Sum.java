
import java.util.Scanner;
public class Target_Sum {
     public static int[] twoSum(int[] nums, int target) {
         int arr[] = new int[2];
          for ( int i = 0 ; i< nums.length ; i++)
          for ( int j = i+1 ; j< nums.length ; j++)
          {
            if ( nums[i] + nums[j] == target && i != j)
            {
             arr[0] = i;
             arr[1] = j;
             break;
            }
          }
            return arr;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int range = sc.nextInt();
         int[] nums = new int[range];
         System.out.println("Enter the elements of the array: ");
         for (int i = 0; i < nums.length; i++) {
           nums   [i] = sc.nextInt();         
         }

         int[] result = twoSum(nums, key);
         for ( int x : result)
         {
            System.out.print(x + " ");
         }  
         sc.close();
      }
}

                