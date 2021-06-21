package minimize_maximum_pair_sum_in_array_1877;

import java.util.Arrays;

class Solution {
    /*
    Runtime: 51 ms, faster than 74.71% of Java online submissions for Minimize Maximum Pair Sum in Array.
    Memory Usage: 54.8 MB, less than 75.59% of Java online submissions for Minimize Maximum Pair Sum in Array.
     */
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length / 2; i++) {
            final int currElem = nums[i];
            final int pairForCurrElem = nums[nums.length-1-i];
            max = Math.max(max, currElem + pairForCurrElem);
        }
        return max;
    }
}