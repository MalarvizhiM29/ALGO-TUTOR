
public class gcd {
    public static void main(String[] args) {
        int a = 7, b = 6;
        System.out.println(gcd1(a, b));
    }

    private static int gcd1(int a, int b) {
        if (b == 0)
            return a;
        return gcd1(b, a % b);
    }
}
