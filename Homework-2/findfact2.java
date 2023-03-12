
public class findfact2 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(fact(n));
    }

    public static long fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }
}
