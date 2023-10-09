package leetcode.medium;

// public class medium_34{
//     public static void main(String[] args) {
        
//     }
//         public int[] searchRange(int[] nums, int target) {
        
//         int[] ans = {-1,-1};
//         int start= search(nums, target, true);
//         int end= search(nums, target,false);

//         ans[0]=start;
//         ans[1]=end;

//         return ans;

//         }

//         int search(int[] nums, int target, boolean findStartIndex) {
//         int ans = -1;
//         int start = 0;
//         int end = nums.length - 1;

//         while(start <= end) {
      
//             int mid = start + (end - start) / 2;

//             if (target < nums[mid]) {
//                 end = mid - 1;
//             } 
//             else if (target > nums[mid]) {
//                 start = mid + 1;
//             } 
//             else {
              
//                 ans = mid;
//                 if(findStartIndex) {
//                     end= mid-1;
//                 }
//                 else{
//                     start= mid+1;
//                 }
//             }
//         }
//         return ans;
//     }
// }


public class Solution {
	public int[] searchRange(int[] A, int target) {
		int start = Solution.firstGreaterEqual(A, target);
		if (start == A.length || A[start] != target) {
			return new int[]{-1, -1};
		}
		return new int[]{start, Solution.firstGreaterEqual(A, target + 1) - 1};
	}

	//find the first number that is greater than or equal to target.
	//could return A.length if target is greater than A[A.length-1].
	//actually this is the same as lower_bound in C++ STL.
	private static int firstGreaterEqual(int[] A, int target) {
		int low = 0, high = A.length;
		while (low < high) {
			int mid = low + ((high - low) >> 1);
			//low <= mid < high
			if (A[mid] < target) {
				low = mid + 1;
			} else {
				//should not be mid-1 when A[mid]==target.
				//could be mid even if A[mid]>target because mid<high.
				high = mid;
			}
		}
		return low;
	}
}