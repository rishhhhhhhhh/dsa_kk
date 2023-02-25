package medium;

public class medium_28 {
    public static void main(String[] args) {
        System.out.println(strStr("overflow", "flow"));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);   
   }    
}
