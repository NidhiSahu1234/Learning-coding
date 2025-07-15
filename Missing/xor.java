package Arrays.Missing;
import java.util.*;

public class xor {
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number N:");

        int N = sc.nextInt();

        System.out.println("Enter the number of elements in an array:");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");

        int xor = N;

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            xor ^= arr[i];
            xor ^= i+1;
        }

        System.out.println(xor);
     }   
}
