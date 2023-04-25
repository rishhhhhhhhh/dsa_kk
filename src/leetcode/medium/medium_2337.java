package leetcode.medium;

public class medium_2337 {
    public static void main(String[] args) {
        System.out.println(canChange("_L__R__R_", "L______RR"));
    }

        public static boolean canChange(String start, String target) {
            int i=0,j=0,n=start.length();
            char chs=' ',cht=' ';
            while(i<n && j<n){
                chs=start.charAt(i); cht=target.charAt(j);
                if(chs=='_')
                    i++;
                else if(cht=='_')
                    j++;
                else if(chs==cht){
                    if(chs=='L' && i<j)
                        return false;
                    if(chs=='R' && i>j)
                        return false;
                    i++;j++;
                }else if(chs!=cht){
                    return false;
                }
            }
            while(i<n)
                if(start.charAt(i)=='_')
                    i++;
                else return false;
            while(j<n)
                if(target.charAt(j)=='_')
                    j++;
                else return false;
            if(chs==cht && i==j)
                return true;
            else return false;
    
        }
    }

