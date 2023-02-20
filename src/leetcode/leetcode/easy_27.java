package leetcode;

public class easy_27 {
    public static void main(String[] args) {
        int[] nums={13,13,14,15};
        System.out.println(removeElement(nums, 14));
        
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0; // pointer to the next position to fill with a non-val element
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; // i is the number of non-val elements in the modified array
    }
}
