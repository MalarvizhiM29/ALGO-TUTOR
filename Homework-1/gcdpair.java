import java.util.*;

public class gcdpair {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 8, 2, 2, 2, 10 };
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }
}
