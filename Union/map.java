package Arrays.Union;
import java.util.*;

public class map {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the first array: ");

        int m = sc.nextInt();

        System.out.println("Enter the number of elements in the second array: ");

        int n = sc.nextInt();

        int[] arr1 = new int[m];

        System.out.println("Enter the number of elements in first array: ");

        for(int i=0;i<m;i++)
        {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[n];
        
        System.out.println("Enter the number of elements in the second array: ");

        for(int i=0;i<n;i++)
        {
            arr2[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<m;i++)
        {
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }

        for(int i=0;i<n;i++)
        {
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }

        for(int i : map.keySet())
        {
            list.add(i);
        }

        for(int k : list)
        {
            System.out.print(list.get(k) + " ");
        }
    }
}
