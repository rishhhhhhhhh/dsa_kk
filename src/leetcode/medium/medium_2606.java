package leetcode.medium;

class Solution {
    public int maximumCostSubstring(String s, String chars, int[] vals) {
        int arr[] = new int[100001];
        for(int i=0; i<s.length(); i++){
            if(chars.contains(s.charAt(i)+""))  arr[i] = vals[chars.indexOf(s.charAt(i))];
            else arr[i] = s.charAt(i)-'a'+1;
        }
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += arr[i];
            max = Math.max(max, sum);
            if(sum < 0) sum = 0;
        }
        return max < 0 ? 0 : max;
    }
}
