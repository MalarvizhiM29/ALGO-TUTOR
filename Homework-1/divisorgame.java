
public class divisorgame {
    public static void main(String[] args) {
        int a = 6, b = 4, c = 1;
        int max = Math.max(b, c);
        int count = 0;
        for (int i = max; i <= a; i++) {
            if (i % b == 0 && i % c == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
