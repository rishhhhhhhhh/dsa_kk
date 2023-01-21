package mathsfordsa;


public class sqrt {
    public static void main(String[] args) {
        int n = 25;
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid  == n/mid) {
                System.out.println(mid); 
            }
            if (mid  > n/mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
}
}
