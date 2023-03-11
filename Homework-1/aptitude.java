
public class aptitude {
    public static void main(String[] args) {
        int res = 0, sum = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                sum++;
                int temp = 0;
                for (int k = 2; k <= 11; k++) {
                    if ((i + 1 + j + 1) % k == 0)
                        temp++;
                }
                if (temp == 1)
                    res++;
            }
        }
        System.out.println(res / sum);
    }
}
