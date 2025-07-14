package Arrays.RemoveDuplicates;
import java.util.*;
import java.util.stream.Collectors;

public class stream {
    public static List<Integer> removeDuplicates(List<Integer> list)
    {
        return list.stream()
                   .distinct()
                   .collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,1,2,3,3,4,5,5);
        List<Integer> result = removeDuplicates(list);
        System.out.println("After removing duplicates (Stream): " + result);
    }
}
