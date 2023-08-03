package leetcode.medium;

import java.util.ArrayList;
class Solution {
    public static void main(String[] args) {
        System.out.println(telephone("", "23"));
    }
    public ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> list = new ArrayList<>();
        if(digits.isEmpty()){
            return list;
        }
    return telephone("",digits);
    }

    public static ArrayList<String> telephone(String ans,String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            ArrayList<String> list1 = new ArrayList<>();
            list1.add(ans);
            return list1;
        }
        int digit = up.charAt(0) - '0';
        if(digit == 7){
            for(int i= (digit-2)*3;i<=(digit-1)*3;i++){
            char ch = (char)('a'+i);
            list.addAll(telephone(ans+ch, up.substring(1)));
        }}else if(digit==8){
            for(int i= 19;i<=21;i++){
            char ch = (char)('a'+i);
            list.addAll(telephone(ans+ch, up.substring(1)));}
        }else if(digit == 9){
            for(int i= 22;i<=25;i++){
            char ch = (char)('a'+i);
            list.addAll(telephone(ans+ch, up.substring(1)));
        }
        }else{
             for(int i= (digit-2)*3;i<(digit-1)*3;i++){
            char ch = (char)('a'+i);
            list.addAll(telephone(ans+ch, up.substring(1)));
        }
        }
        
        return list;
    }
}
