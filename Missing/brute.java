package Arrays.Missing;
import java.util.*;

public class brute {

    static int miss(int[] arr,int n,int N)
    {
        for(int i=1;i<=N;i++)
        {
            int flag = 0;

            for(int j=0;j<n;j++)
            {
                if(arr[j] == i)
                {
                    flag = 1;
                }
            }

            if(flag==0)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number N");

        int N = sc.nextInt();

        System.out.println("Enter the number of elements present in an array: ");

        int n = sc.nextInt();

        System.out.println("Enter the array elements: ");

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int missing = miss(arr,n,N);

        System.out.println("missing number is: " + missing);

    }
}
