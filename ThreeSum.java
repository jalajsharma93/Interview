import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ts = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int m = i + 1;
            int r = nums.length - 1;
            while (m < r) {
                int sum = nums[i] + nums[m] + nums[r];
                if (sum < 0) {
                    m++;
                } else if (sum > 0) {
                    r--;
                } else {
                    List<Integer> t = Arrays.asList(nums[i], nums[m], nums[r]);
                    ts.add(t);
                    m++;
                }
            }
        }
        return new ArrayList<>(ts);
    }
}