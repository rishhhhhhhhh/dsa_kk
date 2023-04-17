package easy;

public class easy_2011 {
    public static void main(String[] args) {
        String[] operations={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] op) {
        int result = 0;
        
        for(int i = 0;i< op.length;i++)
            if(op[i].charAt(1) == '+')result++;
            else result--;
        
        return result;
    }
}
