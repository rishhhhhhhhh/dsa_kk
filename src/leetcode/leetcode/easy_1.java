package leetcode;

import java.util.Arrays;

public class easy_1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(twoSum(nums, 7)));
        
    }
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
        if (nums[i] + nums[j] == target) {
        return new int[]{i, j};
        }
        }
        }
        return new int[]{};
        }
}
