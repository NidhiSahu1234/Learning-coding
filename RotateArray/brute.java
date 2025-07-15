package Arrays.RotateArray;
import java.util.*;

public class brute {

    static void rotateRight(int[] arr,int n ,int k)
    {
        int temp[] = new int[k];

        for(int i=n-k;i<=n-1;i++)
        {
            temp[i-(n-k)] = arr[i];
        }

        for(int i=n-k-1;i>=0;i--)
        {
            arr[i+k] = arr[i]; 
        }

        for(int i=0;i<k;i++)
        {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    static void rotateLeft(int[] arr,int n,int k)
    {
        int[] temp = new int[k];

        for(int i=0;i<k;i++)
        {
            temp[i] = arr[i];
        }

        for(int i=0;i<n-k;i++)
        {
            arr[i] = arr[i+k];
        }

        for(int i=n-k;i<n;i++)
        {
            arr[i] = temp[i-(n-k)];
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of array elements: ");

        int n= sc.nextInt();

        System.out.println("Enter the number k: ");

        int k = sc.nextInt();

        System.out.println("Enter the array elements: ");

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        //rotateRight(arr,n,k);

        rotateLeft(arr,n,k);
    }
    
}
