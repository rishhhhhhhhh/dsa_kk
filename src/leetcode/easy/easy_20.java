package leetcode.easy;

import java.util.ArrayList;

public class easy_20 {
    public static void main(String[] args) {
        System.out.println(isValid("{]"));
    }
    public static boolean isValid(String s) {
        ArrayList<Character> arr = new ArrayList<Character>();

    for(int i = 0 ; i < s.length() ;i++){
        if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
            arr.add(s.charAt(i));
        }
        else if(s.charAt(i) == ')'){
            if(arr.size()>0 && arr.get(arr.size()-1) == '('){
                arr.remove(arr.size()-1);
            }else{
                return false ;
            }
        }else if(s.charAt(i) == '}'){
            if(arr.size()>0 && arr.get(arr.size()-1) == '{'){
                arr.remove(arr.size()-1);
            }else{
                return false ;
            }
        }else if(s.charAt(i) == ']'){
            if(arr.size()>0 && arr.get(arr.size()-1) == '['){
                arr.remove(arr.size()-1);
            }else{
                return false ;
            }
        }
    }      
        return (arr.size()==0);
    }
}
