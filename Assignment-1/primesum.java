public class primesum {
    public static void main(String[] args) {
        int n = 9;
        int[] temp = new int[n + 1];
        int[] res = new int[2];
        temp[0] = 0;
        temp[1] = 0;
        for (int i = 2; i <= n; i++) {
            temp[i] = 1;
        }
        for (int i = 2; i * i <= n; i++) {
            if (temp[i] == 1) {
                for (int j = i * i; j <= n; j += i) {
                    temp[j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (temp[i] == temp[n - i]) {
                res[0] = i;
                res[1] = n - i;
            }
        }
        for (int i : res) {
            System.out.print(i + " ");

        }

    }

}
