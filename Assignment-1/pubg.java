import java.util.*;

public class pubg {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                list.add(gcd(arr[0], arr[i]));
            } else {
                list.add(gcd(arr[i], arr[i + 1]));
            }
        }
        System.out.println(Collections.min(list));
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
