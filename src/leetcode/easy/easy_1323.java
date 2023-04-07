package easy;

public class easy_1323 {
    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
    }
    public static int maximum69Number (int num) {
        String n = String.valueOf(num);
        StringBuilder str = new StringBuilder(n);
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)!='9'){
                str.setCharAt(i,'9');
                break;
            }
        }
        n = str.toString();
        return Integer.parseInt(n);
    }
}
