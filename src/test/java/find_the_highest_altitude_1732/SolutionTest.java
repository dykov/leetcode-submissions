package find_the_highest_altitude_1732;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void largestAltitudeTest1() {
        final int[] gains = new int[]{-5, 1, 5, 0, -7};

        final int actual = solution.largestAltitude(gains);
        final int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void largestAltitudeTest2() {
        final int[] gains = new int[]{-4,-3,-2,-1,4,3,2};

        final int actual = solution.largestAltitude(gains);
        final int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}