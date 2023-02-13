package leetcode;

public class easy_1523{
public int countOdds(int low, int high) {
        
    int num=(high-low+1);
    if(num%2==0){
    return num/2;
    }
    else if(low%2==0){
        return num/2;
    }
    else
    return num/2 + 1;
}
}
