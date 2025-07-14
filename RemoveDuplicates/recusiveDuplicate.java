package Arrays.RemoveDuplicates;

public class recusiveDuplicate 
{
    public static int removeDuplicatess(int[] nums,int i,int n,int index)
    {
        if(index==n) return i;

        if(nums[i-1] != nums[index])
        {
            nums[i] = nums[index];
            i++;
        }

        return removeDuplicatess(nums,i,n,index+1);
    }    

    public static int removeDuplicatess(int[] nums)
    {
        if(nums.length == 0) return 0;
        return removeDuplicatess(nums,1,nums.length,1);
    }

    public static void printArray(int[] nums,int length)
    {
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<length;i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length: " + length);
    }

    public static void main(String[] args)
    {
        int[] arr = {1,1,2,2,3,4,4,5,5,5,6};
        int newLength = removeDuplicatess(arr);
        printArray(arr,newLength);
    }
}
