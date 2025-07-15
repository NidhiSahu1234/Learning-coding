package Arrays;
import java.util.*;

public class linear {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array: ");

        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you search for: ");

        int k = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(arr[i] == k)
            {
                System.out.println("Element is present at index " +  i);
                break;
            }
        }
    }
}
