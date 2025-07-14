package Arrays.RemoveDuplicates;
import java.util.*;

public class kduplicate
{
    public static int removeDuplicates(int[] nums,int k)
    {
        if(nums.length<=k) return nums.length;

        int i=k;
        for(int j=k;j<nums.length;j++)
        {
            if(nums[j] != nums[i-k]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args)
    {
        int[] nums = {1,1,1,2,2,3};
        int k= 2;
        int length = removeDuplicates(nums,k);

        System.out.print("After allowing at most " + k + " duplicates: ");

        for(int i=0;i<length;i++)
        {
            System.out.print(nums[i] + " ");
        }
    }

}

