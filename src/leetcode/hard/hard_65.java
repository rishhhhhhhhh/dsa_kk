package hard;

public class hard_65 {
    public static void main(String[] args) {
        System.out.println(isNumber(".+"));
    }
 
        public static boolean isNumber(String s) {
            // Remove leading and trailing white spaces
            s = s.trim();
            
            // Set up flags for each component of the number
            boolean hasNum = false;
            boolean hasDot = false;
            boolean hasExp = false;
            
            // Iterate through each character of the string
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                
                if (Character.isDigit(c)) {
                    // If current character is a digit, set hasNum flag to true
                    hasNum = true;
                } else if (c == '+' || c == '-') {
                    // Sign character is only allowed at the beginning or after 'e' or 'E'
                    if (i > 0 && s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E') {
                        return false;
                    }
                } else if (c == '.') {
                    // Dot can only appear once and cannot appear after 'e' or 'E'
                    if (hasDot || hasExp) {
                        return false;
                    }
                    hasDot = true;
                } else if (c == 'e' || c == 'E') {
                    // Exponent can only appear once and there must be at least one digit before it
                    if (hasExp || !hasNum) {
                        return false;
                    }
                    hasExp = true;
                    hasNum = false; // Reset hasNum flag for the exponent part
                } else {
                    // Other characters are not allowed
                    return false;
                }
            }
            
            // Return true if hasNum flag is true (i.e., at least one digit exists in the string)
            return hasNum;
        }
    
}
