package Arrays;
import java.util.*;

public class genericlist {
    public static <T> boolean isSorted(List<T> list,Comparator<T> comparator, boolean strict)
    {
        for(int i=0;i<list.size()-1;i++)
        {
            int cmp = comparator.compare(list.get(i),list.get(i+1));
            if((strict && cmp >=0)||(!strict && cmp > 0))
            {
                System.out.println("Not sorted at index " + i + ": " + list.get(i) + " -> " + list.get(i+1));
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter type (int/string): ");
        String type = sc.nextLine().trim().toLowerCase();

        System.out.print("enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        if(type.equals("int"))
        {
            List<Integer> list = new ArrayList<>();
            System.out.println("Enter " + n + " integers:");
            for(int i=0;i<n;i++)
            {
                list.add(sc.nextInt());
            }

            System.out.println("\nAscending:    " + isSorted(list,Comparator.naturalOrder(), false));
            System.out.println("Strict Ascending:   " + isSorted(list,Comparator.naturalOrder(),true));
            System.out.println("Descending:      "+ isSorted(list, Comparator.reverseOrder(), false));
            System.out.println("Strict Descending: " + isSorted(list, Comparator.reverseOrder(),true));
        }
        else if(type.equals("string"))
        {
            List<String> list = new ArrayList<>();
            System.out.println("Enter " + n + " strings:");
            for(int i=0;i<n;i++)
            {
                list.add(sc.nextLine());
            }

            System.out.println("\nAsecending:  " + isSorted(list,Comparator.naturalOrder(),false));
            System.out.println("Strict Ascending:  " + isSorted(list, Comparator.naturalOrder(),true));
            System.out.println("Descending:  " + isSorted(list,Comparator.reverseOrder(),false));
            System.out.println("Strict Descending:  " + isSorted(list, Comparator.reverseOrder(),true));
        }
        else
        {
            System.out.println("Unsupported type.");
        }

        sc.close();

    }
}
