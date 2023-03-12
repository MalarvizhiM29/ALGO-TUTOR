
public class reversestring {
    public static void main(String[] args) {
        String s = "john wick";
        int n = s.length() - 1;
        rev(s, n);
    }

    public static char rev(String s, int n) {
        if (n < 0)
            return 0;
        System.out.print(s.charAt(n));
        return rev(s, n - 1);
    }
}
