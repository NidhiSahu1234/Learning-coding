package Arrays.Union;
import java.util.*;

public class generic {

    public static <T extends Comparable<T>> List<T> unionOfSortedArrays(List<T> arr1,List<T> arr2)
    {
        List<T> union = new ArrayList<>();
        int i =0, j=0;
        int m = arr1.size(), n = arr2.size();

        while(i<m && j<n)
        {
            T a = arr1.get(i);
            T b = arr2.get(j);

            if(a.compareTo(b)<0)
            {
                if(union.isEmpty() || !union.get(union.size()-1).equals(a))
                {
                   union.add(a);
                }
                i++;
            }
            else if(b.compareTo(a)<0)
            {
                if(union.isEmpty()|| !union.get(union.size() -1).equals(b))
                {
                   union.add(b);
                }
                j++;
            }
            else
            {
                if(union.isEmpty()|| !union.get(union.size() - 1).equals(a))
                {
                   union.add(a);
                }
                i++;
                j++;
            }
        }

        while(i<m)
        {
            T a = arr1.get(i);
            if(union.isEmpty() || !union.get(union.size()-1).equals(a))
            {
                union.add(a);
            }
            i++;
        }
        while(j<n)
        {
            T b = arr2.get(j);
            if(union.isEmpty() || !union.get(union.size()-1).equals(b))
            {
                union.add(b);
            }
            j++;
        }
        return union;
    }
    public static void main(String[] args)
    {
        List<String> arr1 = Arrays.asList("apple","banana","mango","mango");
        List<String> arr2 = Arrays.asList("banana","cherry","grape");

        List<String> result = unionOfSortedArrays(arr1,arr2);
        System.out.println("Union: " + result);

        List<Integer> intArr1 = Arrays.asList(1,2,3,4,4);
        List<Integer> intArr2 = Arrays.asList(2,3,5,6);

        List<Integer> intResult = unionOfSortedArrays(intArr1,intArr2);
        System.out.println("Union: " + intResult);
    }
}
