package easy;

public class easy_2114 {
    public static void main(String[] args) {
        String[] sentences={"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

        public static int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for(String sentence : sentences){
        
        String[] words = sentence.split(" ");
             int numWords = words.length;
                if(numWords > maxWords){
                    maxWords = numWords;
                }
            }
            return maxWords;
        }
        }

