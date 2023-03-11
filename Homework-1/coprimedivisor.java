
public class coprimedivisor {
    public static void main(String[] args) {
        int a = 30, b = 12, ans = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && gcd(i, b) == 1) {
                ans = i;
            }

        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
