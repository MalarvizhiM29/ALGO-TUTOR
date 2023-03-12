
public class sequence {
    public static void main(String[] args) {
        int n = 3;
        System.out.print(seq(n));
    }

    public static int seq(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 2;

        return seq(n - 2) + seq(n - 1) + seq(n - 3) + n;

    }
}
