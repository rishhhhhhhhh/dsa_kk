package leetcode.medium;

public class medium_1689 {
    public static void main(String[] args) {
        System.out.println(minPartitions("32"));
    }

        public static int minPartitions(String n) {
            int max=-1;
            for(int i=0;i<n.length();i++){
                int num = Character.getNumericValue(n.charAt(i));
                if(num>max)
                    max=num;
            }
            return max;
        }
    }

