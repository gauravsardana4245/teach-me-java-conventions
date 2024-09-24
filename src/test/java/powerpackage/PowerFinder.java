package powerpackage;

public class PowerFinder {
    public static int calculatePower(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        int result = 1;
        for (int i = 0; i<exponent; i++) {
            result *= base;
        }
        return result;
    }
}
