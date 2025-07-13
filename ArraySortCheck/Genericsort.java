package Arrays;
import java.util.*;

public class Genericsort {
    public static <T> boolean isSorted(T[] arr,Comparator<T> comparator,boolean strict)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int cmp = comparator.compare(arr[i],arr[i+1]);
            if(strict && cmp>=0) return false;
            if(!strict && cmp>0) return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array type (int/string): ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        if(type.equals("int"))
        {
            Integer[] arr = new Integer[n];
            System.out.println("Enter " + n + " integers:");
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            System.out.println("\nAscending:    " + isSorted(arr,Comparator.naturalOrder(),false));
            System.out.println("Strict Ascending:  " + isSorted(arr,Comparator.naturalOrder(),true));
            System.out.println("Descending:   " + isSorted(arr,Comparator.reverseOrder(),false));
            System.out.println("Strict Descending: " + isSorted(arr, Comparator.reverseOrder(),true));
        }
        else if(type.equals("string"))
        {
            String[] arr = new String[n];
            System.out.println("Enter " + n + " string:");
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextLine();
            }

            System.out.println("\nAscending:    " + isSorted(arr,Comparator.naturalOrder(),false));
            System.out.println("Strict Ascending:  " + isSorted(arr,Comparator.naturalOrder(),true));
            System.out.println("Descending:    " + isSorted(arr,Comparator.reverseOrder(),false));
            System.out.println("Strict Descending: " + isSorted(arr,Comparator.reverseOrder(),true));
        }
        else
        {
            System.out.println("Unsupported type.");
        }
    }
}
