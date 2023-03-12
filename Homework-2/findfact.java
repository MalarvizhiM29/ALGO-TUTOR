public class findfact {
    public static void main(String args[]) {
        int n = 9;
        System.out.print(fibo(n));
    }

    public static int fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
}