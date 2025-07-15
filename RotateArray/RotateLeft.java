package Arrays.RotateArray;
import java.util.*;

public class RotateLeft {

    static void swap(int[] arr,int i,int j)
    {
        while(i<=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void rotateRight(int[] arr,int n,int k)
    {
        swap(arr,n-k,n-1);
        swap(arr,0,n-k-1);
        swap(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }

    static void rotateLefts(int[] arr,int n,int k)
    {
        swap(arr,0,k-1);
        swap(arr,k,n-1);
        swap(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array: ");

        int n = sc.nextInt();

        System.out.println("Enter the number through which we have to rotate the array: ");

        int k = sc.nextInt();

        System.out.println("Enter the array elements: ");

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        rotateRight(arr,n,k);

        rotateLefts(arr,n,k);
    }
}
