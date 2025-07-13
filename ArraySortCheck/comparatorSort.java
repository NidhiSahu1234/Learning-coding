package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class comparatorSort {
    public static boolean isSortedAscending(Integer[] arr)
    {
        Integer[] sorted = arr.clone();
        Arrays.sort(sorted);
        return Arrays.equals(arr,sorted);
    }

    public static boolean isSortedDescending(Integer[] arr)
    {
        Integer[] sorted = arr.clone();
        Arrays.sort(sorted,Comparator.reverseOrder());
        return Arrays.equals(arr,sorted);
    }
    public static void main(String[] args)
    {
        Integer[] arr1 = {1,2,3,3};
        Integer[] arr2 = {5,4,2,1};
        Integer[] arr3 = {3,1,4};

        System.out.println("arr1 ascending: " + isSortedAscending(arr1));
        System.out.println("arr2 descending: " + isSortedDescending(arr2));
        System.out.println("arr3 ascending: " + isSortedAscending(arr3));
    }
    
}
