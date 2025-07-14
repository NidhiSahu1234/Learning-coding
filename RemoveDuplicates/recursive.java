package Arrays.RemoveDuplicates;

public class recursive {

    public static int removeDuplicates(int[] nums,int i,int n,int index)
    {
        if(index==n) return i;

        if(nums[i-1] != nums[index])
        {
            nums[i] = nums[index];
            i++;
        }
        return removeDuplicates(nums,i,n,index + 1);
    }
    public static void main(String[] args)
    {
        int[] nums = {1,1,2,3,3,4,5,5};
        int length = removeDuplicates(nums,1,nums.length,1);
        System.out.print("New length: " + length + " -> ");
        for(int i=0;i<length;i++)
        {
            System.out.println(nums[i] + " ");
        }
    }
    
}
