package mathsfordsa;

public class power {
    public static void main(String[] args) {
        int base = 5;
        int power = 5;
        int powerr = 1;

        while (power > 0) {
            if ((power & 1) == 1) {
                powerr *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println(powerr);
    }
}
