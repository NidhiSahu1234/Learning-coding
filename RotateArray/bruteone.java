package Arrays.RotateArray;
import java.util.*;

public class bruteone {

    public static void leftRotateByOne(int[] arr,int n)
    {
        int temp = arr[0];

        for(int i=0;i<n-1;i++)
        {
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in an array: ");

        int n = sc.nextInt();

        int[] arr= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        leftRotateByOne(arr,n);
        
        System.out.println("Rotated Array: " + Arrays.toString(arr));

    }
    
}
