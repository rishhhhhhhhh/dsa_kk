package easy;

// public class easy_1512{
//     public static void main(String[] args) {
//         int[] nums={1,2,3,1,1,3};
//         System.out.println(numIdenticalPairs(nums));

//     }
//         public static int numIdenticalPairs(int[] nums) {
//             int count=0;
//             for(int i=0; i<nums.length; i++){
//                 for(int j=i+1; j<nums.length; j++){
//                     if(nums[i]==nums[j]){
//                     count++;
//                     }
//                 }
//             }
//             return count;
//         }
//     }

class Solution {
        public int numIdenticalPairs(int[] A) {
        int ans = 0, cnt[] = new int[101];
        for (int a: A) {
            ans += cnt[a]++;
        }
        return ans;
    }
}
