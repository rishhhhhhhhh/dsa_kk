package easy;

public class easy_125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("arora"));
        
    }
        public static boolean isPalindrome(String s) {
            s = s.toLowerCase();
            char[] c = s.toCharArray();
            int i = 0;
            int j = c.length - 1;
            boolean b = true;
            while (i < j) {
                while (i < j && !Character.isLetterOrDigit(c[i])) {
                    i++;
                }
                while (i < j && !Character.isLetterOrDigit(c[j])) {
                    j--;
                }
                if (c[i] != c[j]) {
                    b = false;
                    break;
                }
                i++;
                j--;
            }
            return b;
        }
    }

