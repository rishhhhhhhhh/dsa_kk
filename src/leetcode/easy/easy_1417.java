package easy;

public class easy_1417 {
    public static void main(String[] args) {
       System.out.println(reformat("ab012cd")); 
    }

    public static String reformat(String s) {
            int digitCount =0;
            int letterCount =0;
            char[] arr = s.toCharArray(), res = new char[s.length()];
            for(char ch:s.toCharArray()){
                if(Character.isLetter(ch)){
                    letterCount++;
                    
                }
                else if(Character.isDigit(ch)){
                    digitCount++;
                    
                }
                else{
                    return "";
                }
            }
            int diff =  Math.abs(letterCount-digitCount);
            if(diff>1) return "";
            boolean isDigit = digitCount>=letterCount;
            for(int i=0,d=0,a=0;i<arr.length;i++){
                if(isDigit){
                    while(!Character.isDigit(arr[d])) d++;
                    res[i]= arr[d++];
                    
                }
                else{
                     while(!Character.isLetter(arr[a])) a++;
                    res[i]= arr[a++];
                }
            isDigit = !isDigit;
            }
            return String.valueOf(res);
            
        }}
