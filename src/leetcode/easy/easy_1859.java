package easy;

public class easy_1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    public static String sortSentence(String s) {
        StringBuilder str = new StringBuilder();
        String[] sp = s.split(" ");
        
        for (int i = 1; i <= sp.length; i++) {
            for (String a : sp) {
                if (a.endsWith(String.valueOf(i))) {
                    str.append(a, 0, a.length() - 1);
                    if(i != sp.length)
                    str.append(" ");
                }
            }
        }
        return String.valueOf(str);
    }
}
