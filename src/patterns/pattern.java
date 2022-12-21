package patterns;

public class pattern {
    public static void main(String[] args) {
        pat1(5);
        System.out.println();
        pat2(5);
        System.out.println();
        pat3(5);
        System.out.println();
        pat4(5);
        System.out.println();
    }

    static void pat1(int n) {
        for (int row = 1; row <= n; row++) {    
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat2(int n) {
        for (int row = 1; row <= n; row++) {        
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }   
            System.out.println();
        }
    }

    static void pat3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pat4(int n) {
        for (int row = 1; row <= n; row++) {        
            for (int col = 1; col <= row; col++) {
                System.out.print(col+ " " );
            }   
            System.out.println();
        }
    }
}
