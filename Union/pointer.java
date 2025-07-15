package Arrays.Union;
import java.util.*;
public class pointer {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array 1: ");

        int m = sc.nextInt();

        System.out.println("Enter the array elements: ");

        int[] arr = new int[m];

        for(int i=0;i<m;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements in array 2: ");

        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter the array elements: ");

        for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }

        ArrayList<Integer> union = new ArrayList<>();

        int j = 0;
        int k = 0;

        while(j<m && k<n)
        {
            if(arr[j]<=arr1[k])
            {
                if(union.size()==0 || arr[j] != union.get(union.size()-1))
                {
                    union.add(arr[j]);
                }
                j++;
            }
            else
            {
                if(union.size()== 0|| arr1[k] != union.get(union.size()-1))
                {
                    union.add(arr1[k]);
                }
                k++;
            }
        }

        while(j<m)
        {
            if(union.get(union.size() - 1) != arr[j])
            {
                union.add(arr[j]);
            }
            j++;
        }

        while(k<n)
        {
            if(union.get(union.size() -1) != arr1[k])
            {
                union.add(arr1[k]);
            }
            k++;
        }

    

        for(int i : union)
        {
            System.out.print(i + " ");
        }
        
    }
    
}
