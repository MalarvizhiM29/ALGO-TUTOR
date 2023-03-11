public class luckynumbers {
    public static void main(String[] args) {
        int n = 12;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                res++;
            }
        }
        System.out.print(res);
    }
}
