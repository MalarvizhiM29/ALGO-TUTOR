import java.util.*;

public class subsequence {

    public void main(String[] args) {
        int nums[] = { 3, 1, 2 };
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> each = new ArrayList<>();
        sub(res, each, 0, nums);

    }

    public void sub(List<List<Integer>> res, List<Integer> each, int i, int[] nums) {
        if (i == nums.length) {
            res.add(each);
            return;

        }
        // pick
        each.add(nums[i]);
        sub(res, new ArrayList<>(each), i + 1, nums);
        each.remove(each.size() - 1);

        // not pick
        sub(res, new ArrayList<>(each), i + 1, nums);

    }

}
