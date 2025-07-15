package Arrays.Union;
import java.util.*;

public class set {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array1: ");

        int m = sc.nextInt();

        System.out.println("Enter the number of elements in an array 2: ");

        int n = sc.nextInt();

        System.out.println("Enter the elements of first array: ");

        int [] arr = new int[m];
        
        for(int i=0;i<m;i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] arr1 = new int[n];

        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<m;i++)
        {
            set.add(arr[i]);
        }

        for(int i=0;i<n;i++)
        {
            set.add(arr1[i]);
        }

        for(int k: set)
        {
            System.out.print(k + " ");
        }
    }
}
