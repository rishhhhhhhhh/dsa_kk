package recursion;

public class removeachar {
    public static void main(String[] args) {
        skip("", "bccbcbcaadss");
        System.out.println(skip("abbcaab"));
        System.out.println(skipword("bcappleseb"));
        System.out.println(skipAppNotApple("bbcappleappbbcidu"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
      char ch=up.charAt(0);
      if(ch=='a'){
      skip(p, up.substring(1));
    } else {
        skip(p + ch, up.substring(1));
    }
}

static String skip(String up) {
    if (up.isEmpty()) {
        return "";
    }

    char ch = up.charAt(0);

    if (ch == 'a') {
        return skip(up.substring(1));
    } else {
        return ch + skip(up.substring(1));
    }
}

static String skipword(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipword(up.substring(5));
        } else {
            return up.charAt(0) + skipword(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}

    
    
