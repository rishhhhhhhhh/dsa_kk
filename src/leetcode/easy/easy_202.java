package leetcode.easy;

public class easy_202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        
    }
    public static boolean isHappy(int n) {
        int s=0;
        while(n>0){
            int a = n%10;
            s += a*a;;
            n /=10;
        } if(s == 1){
            return true;
        }else if(s == 4){
            return false;
        }
        return isHappy(s);
    }
}
