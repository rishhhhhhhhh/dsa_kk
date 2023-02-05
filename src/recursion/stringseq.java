package recursion;

import java.util.ArrayList;


public class stringseq {
    public static void main(String[] args) {
        //sequence("", "abcd");
        System.out.println(sequence2("", "abc"));
        //ascii("", "abcd");
        //System.out.println(ascii2("", "abc"));

    }

    static void sequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sequence(p + ch, up.substring(1));
        sequence(p, up.substring(1));
    }

    static ArrayList<String> sequence2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sequence2(p + ch, up.substring(1));
        ArrayList<String> right = sequence2(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void ascii(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        ascii(p + ch, up.substring(1));
        ascii(p, up.substring(1));
        ascii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> ascii2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = ascii2(p + ch, up.substring(1));
        ArrayList<String> second = ascii2(p, up.substring(1));
        ArrayList<String> third = ascii2(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
