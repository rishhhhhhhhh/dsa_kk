package recursion;

import java.util.ArrayList;

public class lettercombb {
    public static void main(String[] args) {
        System.out.println(lettercomb("", "12"));
    }
    static ArrayList<String> lettercomb(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(lettercomb(p + ch, up.substring(1)));
        }
        return list;
    }
}
