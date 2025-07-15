package Arrays.MoveZeroes;
import java.util.*;

public class brute {

    static void moveZeroes(int[] arr,int n)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(arr[i] != 0)
            {
                list.add(arr[i]);
            }
        }

        int k = list.size();

        for(int i=0;i<k;i++)
        {
            arr[i] = list.get(i);
        }

        for(int i=k;i<n;i++)
        {
            arr[i] = 0;
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

        moveZeroes(arr,n);

        System.out.println("Array after shifting: ");

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
}
