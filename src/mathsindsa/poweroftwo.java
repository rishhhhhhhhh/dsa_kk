package mathsindsa;

public class poweroftwo {
    public static void main(String[] args) {
        int a=32;
        boolean is= (a&(a-1))==0;
        System.out.println(is);
    }
}
