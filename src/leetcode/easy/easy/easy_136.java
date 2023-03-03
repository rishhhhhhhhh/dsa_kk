package easy;

public class easy_136{
    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int n=0;
        for(int i=0; i<nums.length; i++){
            n^= nums[i];
        }
        return n;    
    }
}
