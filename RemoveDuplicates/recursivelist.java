package Arrays.RemoveDuplicates;
import java.util.*;

public class recursivelist {
    public static void removeDuplicates(List<Integer> list,int i)
    {
        if(i >= list.size()) return;

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

    public static List<Integer> removeDuplicates(List<Integer> list)
    {
        if(list==null || list.size() <= 1) return list;
        removeDuplicates(list,1);
        return list;
    }

    public static void printList(List<Integer> list)
    {
        System.out.println("Unique List: " + list);
        System.out.println("New length: " + list.size());
    }

    public static void main(String[] args)
    {
        List<Integer> sortedList = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,4,5,5,5,6));
        removeDuplicates(sortedList);
        printList(sortedList);
    }
}
