
public class kthsymbol {
    public static void main(String args[]) {
        int a = 2, b = 2;
        System.out.print(kth(a, b));
    }

    public static int kth(int n, int k) {
        if (n == 1 && k == 1)
            return 0;
        int mid = (int) (Math.pow(2, n - 1) / 2);
        if (k <= mid) {
            return kth(n - 1, k);
        } else {
            return (kth(n - 1, k - mid) == 1) ? 0 : 1;
        }
    }
}
