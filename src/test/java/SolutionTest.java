import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void replaceDigitsTest1() {
        final String input = "a1c1e1";

        final String actual = solution.replaceDigits(input);
        final String expected = "abcdef";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void replaceDigitsTest2() {
        final String input = "a1b2c3d4e";

        final String actual = solution.replaceDigits(input);
        final String expected = "abbdcfdhe";

        Assertions.assertEquals(expected, actual);
    }

}