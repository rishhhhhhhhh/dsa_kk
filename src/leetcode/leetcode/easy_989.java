package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class easy_989 {
    public static void main(String[] args) {
        
    }
        public List<Integer> addToArrayForm(int[] num, int k) {
            int n=num.length;
            int i=n-1;
            List<Integer> solution=new ArrayList<>();
         while(i>=0|| k>0) {
         if(i>=0) {
         solution.add((num[i]+k)%10);
         k=(num[i]+k)/10;
         }
         else{
             solution.add(k%10);
             k/=10;
         }
         i--;
         }
         Collections.reverse(solution);
         return solution;
        }
    }

