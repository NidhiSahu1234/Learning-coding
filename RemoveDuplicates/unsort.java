package Arrays.RemoveDuplicates;
import java.util.*;

public class unsort {
    public static <T> List<T> removeDuplicates(List<T> list)
    {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static <T> void printList(List<T> list)
    {
        System.out.println("Unique Elements: " + list);
        System.out.println("New Length: " + list.size());
    }

    public static void main(String[] args)
    {
        List<Integer> intList= Arrays.asList(3,1,2,2,4,3,5,1);
        System.out.println("Original Integer List: " + intList);
        List<Integer> uniqueIntList = removeDuplicates(intList);
        printList(uniqueIntList);

        List<String> strList = Arrays.asList("banana","apple","apple","cherry","banana");
        System.out.println("\nOriginal String List: " + strList);
        List<String> uniqueStrList = removeDuplicates(strList);
        printList(uniqueStrList);
    }
}
