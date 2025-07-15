package Arrays.Missing;

import java.util.*;

public class hash {

    static int hashe(int[] arr,int n,int N)
    {
        int[] hash = new int[N+1];

        for(int i=0;i<n;i++)
        {
            hash[arr[i]] += 1;
        }

        for(int i=1;i<=N;i++)
        {
            if(hash[i]==0)
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

        System.out.println("Enter the number of elements in an array: ");

        int n = sc.nextInt();

        int[] arr= new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        int missing = hashe(arr,n,N);

        System.out.println(missing);
    }
}
