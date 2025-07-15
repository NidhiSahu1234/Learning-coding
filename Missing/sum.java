package Arrays.Missing;
import java.util.*;

public class sum {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number N");

    int N = sc.nextInt();

    System.out.println("Enter the number of elements in an array: ");

    int n = sc.nextInt();

    int[] arr = new int[n];

    int sum = 0;

    for(int i=0;i<n;i++)
    {
        arr[i] = sc.nextInt();
        sum += arr[i];
    }

    int actualSum = (N*(N+1))/2;

    int missing = actualSum - sum;

    System.out.println(missing);

}

}