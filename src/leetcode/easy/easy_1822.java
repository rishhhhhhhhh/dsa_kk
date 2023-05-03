class Solution {

    public int arraySign(int[] nums) {

        int m=1;

        for(int i=0;i<nums.length;i++){

            if(nums[i]>0){

                m=m*1;

            }else if(nums[i]<0){

                m*=-1;

            }else{

                m*=0;

            }

        }

        if(m>0){

            return 1;

        }else if(m==0){

             return 0;

        }else{

            return -1;

        }

    }

}
