package easy;

public class easy_771 {
    public static void main(String[] args) {
       System.out.println(numJewelsInStones("aA", "aAAbbbb")); 
    }
    public static int numJewelsInStones(String jewels, String stones) {
     
        int count = 0;
        for(char c: stones.toCharArray()){
            if(jewels.indexOf(c) != -1){
                count++;
            }
        }
        return count;
    }
}
