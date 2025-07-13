package Arrays;
import java.util.*;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Comparator;

public class sort {

    public static boolean isSortedAscending(int[] arr)
    {
        return IntStream.range(0,arr.length-1)
                        .allMatch(i-> arr[i]<=arr[i+1]);
    }

    public static boolean isSortedDescending(int[] arr)
    {
        return IntStream.range(0,arr.length-1)
                        .allMatch(i -> arr[i]>=arr[i+1]);
    }

    static void generalCheck(int[] arr)
    {
        int n = arr.length;

    boolean asc = true;
    boolean desc = true;

    for(int i=0;i<n-1;i++)
    {
        if(arr[i]<arr[i+1]) desc = false;
        if(arr[i]>arr[i+1]) asc = false;
    }
 
    if(asc)
    {
        System.out.println("Array is already sorted in ascending order");
    }
    else if(desc)
    {
        System.out.println("Array is sorted in descending order.");
    }
    else
    {
        System.out.println("Array is not sorted");
    }
    
    }

    public static void main(String[] args)
    {
    
    int[] arr = {3,1,4,2};
    int[] arr1 = {5,4,4,2};
    int[] arr2 = {3,5,1};

    System.out.println("Answer through general check: ");
    generalCheck(arr);

    System.out.println("arr ascending: " + isSortedAscending(arr));
    System.out.println("arr1 descending: " + isSortedDescending(arr1));
    System.out.println("arr2 ascending: " + isSortedAscending(arr2));



    
}
}
