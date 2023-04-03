package easy;

import java.util.Arrays;

public class easy_2574 {
    public static void main(String[] args) {
        int[] arr={10,4,8,3};
        System.out.println(Arrays.toString(leftRigthDifference(arr)));
    }
    

    public static int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int leftSum, rightSum;

        for(int i = 0; i < answer.length; i++){
            leftSum = 0;
            for(int j = 0; j < i; j++){
                leftSum += nums[j];
            }
            rightSum = 0;
            for(int j = i+1; j < nums.length; j++){
                rightSum += nums[j];
            }

            if(leftSum - rightSum >= 0){
                answer[i] = leftSum - rightSum;
            }
            else{
                answer[i] = -(leftSum - rightSum);
            }
        }
        return answer;
    }

}