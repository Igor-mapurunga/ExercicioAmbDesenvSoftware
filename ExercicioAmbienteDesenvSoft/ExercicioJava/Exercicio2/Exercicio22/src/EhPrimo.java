public class EhPrimo {
    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}