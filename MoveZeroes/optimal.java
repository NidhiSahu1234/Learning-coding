package Arrays.MoveZeroes;
import java.util.*;

public class optimal {

    static void moveZero(int[] arr,int n)
    {
        int j = 0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                j=i;
                break;
            }
        }

        for(int i=j+1;i<n;i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements present in an array: ");

        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        moveZero(arr,n);

        System.out.println("Array after shifting: ");

        for(int i=0;i<n;i++)
         {
            System.out.print(arr[i] + " ");
         }
    }
}
