import java.util.*;

public class primeaddition {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        int n = 26;
        for (int i = 2; i <= n; i++) {
            int temp = 0;
            for (int j = 2; j <= n; j++) {
                if (i % j == 0)
                    temp++;
            }
            if (temp  == 1) {
                res.add(i);
            }
            System.out.println(res);
            int sum = n, count = 0;
            for (int k = res.size() - 1; k >= 0; k--) {
                int max = Collections.max(res);
                if (sum >= max) {
                    sum -= max;
                    count++;
                }
                res.remove(res.indexOf(max));
                if (sum == 0)
                    break;
            }
            System.out.println(count);
        }
    }
}
