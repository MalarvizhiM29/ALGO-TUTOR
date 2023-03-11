public class opendoors {
    public static void main(String[] args) {
        int n = 6;
        Boolean[] arr = new Boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                if (i == 1) {
                    for (int j = 0; j <= n; j++)
                        arr[j] = true;
                } else if (i % k == 0) {
                    arr[k] = false;
                }
            }
        }
        int count = 0;
        for (boolean i : arr) {
            if (i == true)
                count++;
        }
        System.out.println(count);
    }
}
