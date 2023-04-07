package easy;

import java.util.ArrayList;
import java.util.List;

public class easy_1002 {
    public static void main(String[] args) {
        String[] goStrings= {"bella","label","roller"};
        System.out.println(commonChars(goStrings));
    }

    public static List<String> commonChars(String[] words) {
        List<String> strResult = new ArrayList<String>();
        for(int i = 0; i < words[0].length(); i++){
            String ch = String.valueOf(words[0].charAt(i));
            boolean isTrue = false;
            for(int j = 1; j < words.length; j++){
                if(words[j].contains(ch)){
                    words[j] = words[j].replaceFirst(ch,"");
                    isTrue = true;
                }else{
                    isTrue = false;
                    break;
                }
            }
            if(isTrue){
                strResult.add(ch);
            }
        }
        
        return strResult;
    }
}
