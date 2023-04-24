package leetcode.easy;

public class easy_1047 {
   public static void main(String[] args) {
    System.out.println("aabbcccedhd");
   } 
    public static String removeDuplicates(String S) {
     StringBuilder sb = new StringBuilder();
     for (char c : S.toCharArray()) {
         int size = sb.length();
         if (size > 0 && sb.charAt(size - 1) == c) { 
             sb.deleteCharAt(size - 1); 
         }else { 
             sb.append(c); 
         }
     }
     return sb.toString();
 }
}

