package easy;
import java.util.ArrayList;
import java.util.List;

class easy_1431{
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }

public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> list = new ArrayList<>();
    int max = candies[0];
    for(int i=1; i<candies.length; i++){
        if(candies[i]>max){
            max = candies[i];
        }
    }
    for(int i=0; i<candies.length; i++){
            list.add(candies[i]+extraCandies >=max);
    }
    return list;
}
}