package medium;

public class medium_198 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        int res[] = new int[nums.length+1];
        res[0]=0;
        res[1]=nums[0];
        for(int i=1;i<nums.length;++i){
            res[i+1]=Math.max(res[i],res[i-1]+nums[i]);
        }
        return res[nums.length];
    }
    
}
