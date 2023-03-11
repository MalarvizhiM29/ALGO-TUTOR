public class computencr2 {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int p = 13;
        int fact1 = factorial(n);
        int fact2 = factorial(r);
        int fact3 = factorial(n - r);
        System.out.println(((int) fact1 / (fact3 * fact2)) % p);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
