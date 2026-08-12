import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int min = nums[0];
        int max = nums[0];

        // Find min, max and store numbers
        for (int num : nums) {

            set.add(num);

            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

        List<Integer> ans = new ArrayList<>();

        // Check numbers between min and max
        for (int i = min; i <= max; i++) {

            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}