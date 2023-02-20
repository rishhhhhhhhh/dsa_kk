package easy;

public class easy_1342 {
    public static void main(String[] args) {
        System.out.println(numbersteps(14));
    }
    
    static int numbersteps(int n){
        return reduce(n,0);

    }

    static int reduce(int n, int steps){
        if(n==0){
            return steps;
        }

        if(n%2==0){
        return reduce(n/2,steps+1);
    }
    else{
        return reduce(n-1, steps+1);
    }


    }
}
