package easy;

public class easy_258 {
    public static void main(String[] args) {
        System.out.println(addDigits(37));
    }

        public static int addDigits(int num) {
            if(num == 0) return 0;
            else if(num % 9 == 0) return 9;
            else return num % 9;
        }
}
