public class enumeratinggcd {
    public static void main(String[] args) {
        String str = "1";
        String str1 = "3";
        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str1);
        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
