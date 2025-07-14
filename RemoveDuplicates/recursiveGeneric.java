package Arrays.RemoveDuplicates;
import java.util.*;

public class recursiveGeneric {
    public static <T> void removeDuplicates(List<T> list, int i)
    {
        if(i>= list.size()) return;

        if(Objects.equals(list.get(i),list.get(i-1)))
        {
            list.remove(i);
            removeDuplicates(list,i);
        }
        else
        {
            removeDuplicates(list,i+1);
        }
    }

    public static <T> List<T> removeDuplicates(List<T> list)
    {
        if(list == null || list.size() <= 1) return list;
        removeDuplicates(list,1);
        return list;
    }

    public static <T> void printList(List<T> list)
    {
        System.out.println("Unique List: " + list);
        System.out.println("New Length: " + list.size());
    }

    public static void main(String[] args)
    {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,1,2,3,3,4,5,5));
        System.out.println("Original Integer List: " + intList);
        removeDuplicates(intList);
        printList(intList);

        List<String> strList = new ArrayList<>(Arrays.asList("apple","apple","banana","banana","cherry"));
        System.out.println("\nOriginal String List: " + strList);
        removeDuplicates(strList);
        printList(strList);
    }

}
