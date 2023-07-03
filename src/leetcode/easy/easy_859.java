package leetcode.easy;

import java.util.Arrays;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        boolean result = false;
        if(s.length() == goal.length()){
            int[] c1 = new int[26];
            int[] c2 = new int[26];
            for(int i = 0; i<s.length();i++){
                c1[s.charAt(i)-'a']++;
                c2[goal.charAt(i)-'a']++;
            }
            if(Arrays.equals(c1,c2)){
                int count = 0;
                for(int i = 0; i<s.length();i++){
                    if(s.charAt(i)!=goal.charAt(i)) count++;
                    if(count>2) break;
                }
                if(count == 0){
                    for(int i = 0; i<c1.length;i++){
                        if(c1[i]>=2){
                            result = true;
                            break;
                        }
                    }
                }
                if(count == 2) result = true;                
            }
        }
        return result;
    }
}