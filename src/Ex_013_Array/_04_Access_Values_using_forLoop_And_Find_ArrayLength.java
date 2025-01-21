package Ex_013_Array;

public class _04_Access_Values_using_forLoop_And_Find_ArrayLength {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9};
        System.out.println("Array Length: "+nums.length);
        for(int i=0; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
