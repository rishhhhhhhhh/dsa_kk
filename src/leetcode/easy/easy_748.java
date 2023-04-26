package leetcode.easy;

public class easy_748 {
    public static void main(String[] args) {
        
    }
        public static String shortestCompletingWord(String licensePlate, String[] words) {
            // Function to perform sorting
            Arrays.sort(words, Comparator.comparing(s->s.length()));   
        
            int[] arr = new int[26];
            for(int i=0; i<licensePlate.length(); i++){
                if((licensePlate.charAt(i)>='a' && licensePlate.charAt(i)<='z') 
                || (licensePlate.charAt(i)>='A' && licensePlate.charAt(i)<='Z')){
    
                arr[Character.toLowerCase(licensePlate.charAt(i))-'a']++;
                }
            }
    
    
            for(int i=0; i<words.length; i++){
                int[] arr2 = new int[26];
                for(int j=0; j<words[i].length(); j++){
                    // arr2[words[i].charAt(j)-'a']++;
    
                    if((words[i].charAt(j)>='a' && words[i].charAt(j)>='z') || (words[i].charAt(j)>='A' && words[i].charAt(j)>='Z')){
    
                arr2[Character.toLowerCase(words[i].charAt(j))-'a']++;
                
                }
                }
    
                //now compare arr1 and arr2
                boolean bl = true;
    
                for(int j=0; j<26; j++){
                    if(arr2[j]<arr[j]){
                        bl=false;
                        break;
                    }
                }
                if(bl==true){
                    return words[i]; 
                }
            }
            return "";
        }
    }
