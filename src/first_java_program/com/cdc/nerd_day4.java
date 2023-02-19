// Sandhya is a very intelligent programmer. She is given a task to arrange the given string in a twisted pattern. For example, consider the string "APPLABXYJK" and the twisted pattern of the string will be formed as shown below.


// After rearranging the given string in a twisted pattern, the new string has to be read line by line. So the output of the above string will be "AAJPLBYKPX".
// Help Sandhya to write the code that will take a string and make this conversion given a number of rows.
// Input format
// The first line of the input is the input string to be rearranged. The second line of the string is the number of rows.
// Output format
// The output is the twisted string of the given input string.
// Code constraints
// 1<= slength <= 1000
// s consists of English letters (lower-case and upper-case)," and ".
// Sample testcases
// Input 1
// IAMNEOISHIRING
// 3

// Output 1
// IEHNANOSIIGMIR


import java.util.Scanner;
public class nerd_day4 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String jumbled=sc.next();
            int row=sc.nextInt();
            System.out.print(arranged(jumbled,row));
        }
    }
    public static String arranged(String word, int r){
        String result="";
        int left_inc,right_inc;
        left_inc=2*r-2;
        right_inc=0;
        int str_length=word.length();
        if (str_length==1){
            return word;
        }
        for(int i=0;i<r;i++){
            for(int j=i;j<=str_length;){
                if(left_inc!=0){
                    result=result+word.charAt(j);
                    j=j+left_inc;
                }
                if(j>=str_length){
                    break;
                }
                if(right_inc!=0){
                    result=result+word.charAt(j);
                    j=j+right_inc;
                }
            }
            left_inc-=2;
            right_inc+=2;
        }
          return result;     
}

}

