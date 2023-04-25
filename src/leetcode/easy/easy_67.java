package leetcode.easy;

public class easy_67{
    public static void main(String[] args) {
        
    }
    public String addBinary(String a, String b) {
        int carry=0;
        String result="";
        int i=0;
        int alength=a.length();
        int blength=b.length();
        while(i<alength||i<blength||carry!=0){
            int x = 0;
            if(i<alength && a.charAt(alength-1-i) =='1') x  = 1;
            int y = 0;
            if(i<blength && b.charAt(blength-1-i) =='1') y = 1;
         
            result=(x+y+carry)%2+result;
            carry=(x+y+carry)/2;
            i++;
        }
        return result;
     }
}