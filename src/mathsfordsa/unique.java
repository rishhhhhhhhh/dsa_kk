package mathsfordsa;

public class unique {
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,4,3,2,1};
            System.out.println(ans(arr));
        }
    
        private static int ans(int[] arr) {
            int unique = 0;    
            for(int n : arr) {
                unique ^= n;
            }
    
            return unique;
        }
    }

