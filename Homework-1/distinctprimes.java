import java.util.*;

public class distinctprimes {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int g = 1;
        for (int i : arr) {
            g *= i;
        }
        Arrays.sort(arr);
        int count = 0;
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i <= arr[arr.length - 1]; i++) {
            int temp = 0;
            for (int j = 2; j <= arr[arr.length - 1]; j++) {
                if (i % j == 0)
                    temp++;
            }
            if (temp == 1)
                res.add(i);
        }
        for (int i : res) {
            if (g % i == 0)
                count++;
        }
        System.out.println(count);
    }
}
