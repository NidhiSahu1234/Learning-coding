package Arrays.RemoveDuplicates;
import java.util.*;

public class klist {
    public static <T> List<T> allowDuplicates(List<T> list, int k)
    {
        Map<T,Integer> countMap = new LinkedHashMap<>();
        List<T> result = new ArrayList<>();

        for(T element : list)
        {
            int count = countMap.getOrDefault(element,0);
            if(count<k)
            {
                result.add(element);
                countMap.put(element,count+1);
            }
        }
        return result;
    }

    public static <T> void printList(List<T> list)
    {
        System.out.println("Processed List (up to k duplicates): " + list);
        System.out.println("New Length: " + list.size());
    }

    public static void main(String[] args)
    {
        List<Integer> intList = Arrays.asList(1,1,1,2,2,3,3,3,3);
        int k = 2;
        System.out.println("Original Int List: " + intList);
        List<Integer> filteredInt = allowDuplicates(intList, k);
        printList(filteredInt);

        List<String> strList = Arrays.asList("apple","apple","apple","banana","banana","cherry","apple");
        System.out.println("\nOriginal String List: " + strList);
        List<String> filteredStr = allowDuplicates(strList,k);
        printList(filteredStr);

    }
    
}
