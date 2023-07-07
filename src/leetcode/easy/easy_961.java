class Solution {
    public static void main(String[] args) {
        int[] nums={1,2,3,3};
        System.out.println(repeatedNTimes(nums));

    }
    public static int repeatedNTimes(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) s = nums[i];
            }
        }
        return s;
    }
}