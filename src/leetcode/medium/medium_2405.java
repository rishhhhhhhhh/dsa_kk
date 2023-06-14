package leetcode.medium;

public class medium_2405 {
    public static void main(String[] args) {
        System.out.println(partitionString("abacabab"));
    }
        public static int partitionString(String s) {
            int[] last_pos = new int[26];
            int partitions = 0;
            int last_end = 0;
            for (int i = 0; i < s.length(); i++) {
                if (last_pos[s.charAt(i) - 'a'] >= last_end) {
                    partitions++;
                    last_end = i + 1;
                }
                last_pos[s.charAt(i) - 'a'] = i + 1;
            }
            return partitions;
        }
    }

