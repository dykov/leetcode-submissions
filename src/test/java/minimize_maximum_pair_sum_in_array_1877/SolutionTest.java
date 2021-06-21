package minimize_maximum_pair_sum_in_array_1877;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void minPairSumTest1() {
        final int[] nums = new int[]{3, 5, 2, 3};

        final int actual = solution.minPairSum(nums);
        final int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minPairSumTest2() {
        final int[] nums = new int[]{3,5,4,2,4,6};

        final int actual = solution.minPairSum(nums);
        final int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
}