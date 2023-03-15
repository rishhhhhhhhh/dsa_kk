package easy;

import java.util.Arrays;

public class easy_217 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

public static boolean containsDuplicate(int[] nums) {
Arrays.sort(nums);
for(int i =0; i < nums.length -1; i++)
{
if(nums[i] == nums[i+1])
{
return true;
}
}
return false;
}
}
